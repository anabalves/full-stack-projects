import { BrowserRouter, Routes as Router, Route } from "react-router-dom";
import Footer from "./components/Footer";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";

function Routes() {
  return (
    <>
      <BrowserRouter>
      <Navbar />
      <Router>
        <Route path="/" element={<Home />} />
      </Router>
      <Footer />
    </BrowserRouter>
    </>
  );
}

export default Routes;
