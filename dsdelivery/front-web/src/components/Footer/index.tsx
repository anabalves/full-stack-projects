import "./styles.css";
import { ReactComponent as InstagramIcon } from "../../assets/instagram.svg";
import { ReactComponent as LinkedinIcon } from "../../assets/linkedin.svg";
import { ReactComponent as YouTubeIcon } from "../../assets/youtube.svg";

function Footer() {
  return (
    <footer className="main-footer footer-text">
      App desenvolvido por{" "}
      <a className="footer-text-evidence" href="https://github.com/anabalves" target="_new">
        Ana Beatriz Barbosa Alves
      </a>{" "}
      durante a 2ª ed. do evento Semana DevSuperior
      <div className="footer-icons">
        <a href="https://youtube.com/c/devsuperior" target="_new">
          <YouTubeIcon />
        </a>
        <a href="https://www.linkedin.com/school/devsuperior" target="_new">
          <LinkedinIcon />
        </a>
        <a href="https://www.instagram.com/devsuperior.ig/" target="_new">
          <InstagramIcon />
        </a>
      </div>
    </footer>
  );
}

export default Footer;
