import axios from "axios";

export const BASE_URL =
  process.env.REACT_APP_BACKEND_URL ?? "http://192.168.15.4:8080";

export function fetchOrders() {
  return axios(`${BASE_URL}/orders`);
}

export function confirmDelivery(orderId: number) {
  return axios.put(`${BASE_URL}/orders/${orderId}/delivered`);
}
