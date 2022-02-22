import { BrowserRouter, Routes as Router, Route } from "react-router-dom";
import Header from "./components/Header";
import Charts from "./pages/Charts";
import Home from "./pages/Home";
import Records from "./pages/Records";

function Routes() {
  return (
    <BrowserRouter>
      <Header />
      <Router>
        <Route path="/" element={<Home />} />
        <Route path="/records" element={<Records />} />
        <Route path="/charts" element={<Charts />} />
      </Router>
    </BrowserRouter>
  );
}

export default Routes;
