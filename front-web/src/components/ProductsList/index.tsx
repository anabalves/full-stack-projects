import { Product } from "../../types/product";
import ProductsCard from "../ProductCard";

type Props = {
  products: Product[];
};

function ProductsList({ products }: Props) {
  return (
    <div className="orders-list-container">
      <div className="orders-list-items">
        {products.map((product) => (
          <ProductsCard key={product.id} product={product} />
        ))}
      </div>
    </div>
  );
}

export default ProductsList;
