package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@Api(value = "/sales", tags = "DSMeta API", description = "API Para Consultar Vendas e Enviar Notificacao via SMS com os Dados dos Melhores Vendedores")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    @ApiOperation(value = "Fetch all sales details", notes = "get all sales")
    public List<Sale> findSales() {
        return service.findSales();
    }

}
