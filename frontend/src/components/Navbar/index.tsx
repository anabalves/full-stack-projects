import "./styles.css";
import { ReactComponent as GithubIcon } from "../../assets/github.svg";
import { ReactComponent as Logo } from "../../assets/logo.svg";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <div className="ds-movie-nav-logo">
            <Logo />
            <h1 className="ds-movie-nav-logo-text">DSMovie</h1>
          </div>
          <a
            href="https://github.com/devsuperior"
            target="_blank"
            rel="noreferrer"
          >
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/devsuperior</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
