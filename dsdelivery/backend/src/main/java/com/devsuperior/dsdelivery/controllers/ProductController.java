package com.devsuperior.dsdelivery.controllers;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdelivery.dto.ProductDTO;
import com.devsuperior.dsdelivery.services.ProductService;

@RestController
@RequestMapping(value = "/products")
@Api(value = "/products", tags = "DSDelivery API", description = "API Para Realizar e Acompanhar Pedidos em Delivery")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	@ApiOperation(value = "Fetch all products details", notes = "get all products")
	public ResponseEntity<List<ProductDTO>> findAll() {
		List<ProductDTO> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
