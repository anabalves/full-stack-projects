package com.devsuperior.dsvendas.controllers;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers")
@Api(value = "/sellers", tags = "DSVendas API", description = "API Para Acompanhar Vendas")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	@ApiOperation(value = "Fetch all sellers details", notes = "get all sellers")
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

}