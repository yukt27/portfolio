package com.professional.portfolio.service;

import com.professional.portfolio.model.About;

import java.util.List;
import java.util.UUID;

public interface IPortfolioService {
    public List<About> getPortfolio();
    public void addPortfolio(UUID id, String name, String profile, Long mob, String address);
}
