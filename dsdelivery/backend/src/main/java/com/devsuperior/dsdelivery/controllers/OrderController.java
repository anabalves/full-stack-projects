package com.devsuperior.dsdelivery.controllers;

import java.net.URI;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.dsdelivery.dto.OrderDTO;
import com.devsuperior.dsdelivery.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
@Api(value = "/orders", tags = "DSDelivery API", description = "API Para Realizar e Acompanhar Pedidos em Delivery")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	@ApiOperation(value = "Fetch all orders details", notes = "get all orders")
	public ResponseEntity<List<OrderDTO>> findAll() {
		List<OrderDTO> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@ApiOperation(value = "Create order", notes = "Create new order")
	public ResponseEntity<OrderDTO> insert(@RequestBody OrderDTO dto) {
		dto = orderService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping("/{id}/delivered")
	@ApiOperation(value = "Update Order Status to Delivered", notes = "Update existing order")
	public ResponseEntity<OrderDTO> setDelivered(@PathVariable Long id) {
		OrderDTO dto = orderService.setDelivered(id);
		return ResponseEntity.ok().body(dto);
	}

}
