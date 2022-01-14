import axios from "axios";
import { useEffect, useState } from "react";
import { toast } from "react-toastify";
import MovieCard from "../../components/MovieCard";
import Pagination from "../../components/Pagination";
import { MoviePage } from "../../types/movie";
import { BASE_URL } from "../../utils/request";

function Listing() {
  const [pageNumber, setPageNumber] = useState(0);
  const [page, setPage] = useState<MoviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true,
  });

  useEffect(() => {
    axios
      .get(`${BASE_URL}/movies?page=${pageNumber}&size=10&sort=title,asc`)
      .then((response) => {
        const data = response.data as MoviePage;
        setPage(data);
      })
      .catch(() => {
        toast.error("Erro ao listar filmes.");
      });
  }, [pageNumber]);

  return (
    <>
      <Pagination />
      <div className="container">
        <div className="row">
          {page.content.map((movie) => (
            <div key={movie.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
              <MovieCard movie={movie} />
            </div>
          ))}
        </div>
      </div>
    </>
  );
}

export default Listing;
