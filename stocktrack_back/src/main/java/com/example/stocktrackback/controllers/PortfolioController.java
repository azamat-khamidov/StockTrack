package com.example.stocktrackback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stocktrackback.services.IPortfolioService;

@RestController
public class PortfolioController {

    @Autowired
    private IPortfolioService portfolioService;

    // sample mapping
    // TODO REMOVE BEFORE FINAL VERSION
    @GetMapping(value="/sample")
    public String getSample(){
        return portfolioService.getSample();
    }

}
