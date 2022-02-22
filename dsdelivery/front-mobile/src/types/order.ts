import { Product } from "./product";

export type Order = {
  id: number;
  address: string;
  latitude: number;
  longitude: number;
  moment: string;
  status: string;
  total: number;
  products: Product[];
};
