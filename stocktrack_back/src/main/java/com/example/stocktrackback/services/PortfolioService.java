package com.example.stocktrackback.services;

import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService{

    @Override
    public String getSample(){
        return "SAMPLE ENDPOINT RETURNING";
    }
}
