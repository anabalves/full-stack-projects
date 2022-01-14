import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { toast } from "react-toastify";
import { Movie } from "../../types/movie";
import { BASE_URL } from "../../utils/request";
import "./styles.css";

type Props = {
  movieId: string;
};

function FormCard({ movieId }: Props) {
  const [movie, setMovie] = useState<Movie>();

  useEffect(() => {
    axios
      .get(`${BASE_URL}/movies/${movieId}`)
      .then((response) => {
        setMovie(response.data);
      })
      .catch(() => {
        toast.error("Erro ao buscar filme.");
      });
  }, [movieId]);

  const handleSubmit = () => {
    toast.success("Avaliação realizada com sucesso!");
  };

  return (
    <div className="dsmovie-form-container">
      <img
        className="dsmovie-movie-card-image"
        src={movie?.image}
        alt={movie?.title}
      />
      <div className="dsmovie-card-bottom-container">
        <h3>{movie?.title}</h3>
        <form className="dsmovie-form">
          <div className="form-group dsmovie-form-group">
            <label htmlFor="email">Informe seu email</label>
            <input type="email" className="form-control" id="email" />
          </div>
          <div className="form-group dsmovie-form-group">
            <label htmlFor="score">Informe sua avaliação</label>
            <select className="form-control" id="score">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
          </div>
          <div className="dsmovie-form-btn-container">
            <Link to="/">
              <button
                type="submit"
                className="btn btn-primary dsmovie-btn"
                onClick={handleSubmit}
              >
                Salvar
              </button>
            </Link>
          </div>
        </form>
        <Link to="/">
          <button className="btn btn-primary dsmovie-btn mt-3">Cancelar</button>
        </Link>
      </div>
    </div>
  );
}

export default FormCard;
