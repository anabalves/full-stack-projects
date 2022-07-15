package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;
import com.devsuperior.dsmeta.services.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
@Api(value = "/sales", tags = "DSMeta API", description = "API Para Consultar Vendas e Enviar Notificacao via SMS com os Dados dos Melhores Vendedores")
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService smsService;

    @GetMapping
    @ApiOperation(value = "Fetch all sales details", notes = "get all sales")
    public Page<Sale> findSales(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    @ApiOperation(value = "Send a SMS notification by Id Sale", notes = "sends a notification SMS with the Best Seller Details")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }

}
