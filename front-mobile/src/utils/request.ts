import axios from "axios";

export const BASE_URL = "https://sds2-anabalves.herokuapp.com";

export function fetchOrders() {
  return axios(`${BASE_URL}/orders`);
}

export function confirmDelivery(orderId: number) {
  return axios.put(`${BASE_URL}/orders/${orderId}/delivered`);
}
