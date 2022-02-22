import { BrowserRouter, Routes as Router, Route } from "react-router-dom";
import Footer from "./components/Footer";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import Orders from "./pages/Orders";

function Routes() {
  return (
    <>
      <BrowserRouter>
      <Navbar />
      <Router>
        <Route path="/" element={<Home />} />
        <Route path="/orders" element={<Orders />} />
      </Router>
      <Footer />
    </BrowserRouter>
    </>
  );
}

export default Routes;
