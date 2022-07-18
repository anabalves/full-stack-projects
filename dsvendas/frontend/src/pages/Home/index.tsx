import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

function Home() {
  return (
    <>
      <NavBar />
      <div className="container text-center">
        <div className="jumbotron">
          <h1 className="display-4 text-primary">DSVendas</h1>
          <h3 className="lead text-dark">
            Analise o desempenho das suas vendas por diferentes perspectivas
          </h3>
          <hr />
          <h6 className="text-secondary">
            Esta aplicação consiste em exibir um dashboard a partir de dados
            fornecidos por um back end construído com Spring Boot.
          </h6>
          <Link to="/dashboard">
            <button type="button" className="mt-2 btn btn-outline-primary btn-lg col-md-12">
              Acessar Dashboard
            </button>
          </Link>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default Home;