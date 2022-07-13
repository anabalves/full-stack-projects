import "./styles.css";
import { ReactComponent as GithubIcon } from "../../assets/github.svg";
import { ReactComponent as Logo } from "../../assets/logo.svg";
import { Link } from "react-router-dom";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <div className="ds-movie-nav-logo">
            <Logo />
            <Link to="/">
              <span className="ds-movie-nav-logo-text">DSMovie</span>
            </Link>
          </div>
          <a href="https://github.com/anabalves" target="_blank" rel="noreferrer">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/anabalves</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
