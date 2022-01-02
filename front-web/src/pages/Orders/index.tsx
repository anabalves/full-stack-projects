import { useEffect, useState } from "react";
import { toast } from "react-toastify";
import OrderLocation from "../../components/OrderLocation";
import ProductsList from "../../components/ProductsList";
import StepsHeader from "../../components/StepsHeader";
import { OrderLocationData } from "../../types/order";
import { Product } from "../../types/product";
import { fetchProducts } from "../../utils/request";
import "./styles.css";

function Orders() {
  const [products, setProducts] = useState<Product[]>([]);
  const [orderLocation, setOrderLocation] = useState<OrderLocationData>();
  
  useEffect(() => {
    fetchProducts()
      .then((response) => setProducts(response.data))
      .catch(() => {
        toast.warning("Erro ao listar produtos.");
      });
  }, []);

  return (
    <div className="orders-container">
      <StepsHeader />
      <ProductsList products={products} />
      <OrderLocation onChangeLocation={location => setOrderLocation(location)} />
    </div>
  );
}

export default Orders;
