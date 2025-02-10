package com.professional.portfolio.service;

import com.professional.portfolio.model.About;
import com.professional.portfolio.repository.PortfolioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PortfolioService implements IPortfolioService {

    @Autowired
    @Qualifier("profileRepo")
    private PortfolioRepo portfolioRepo;

    @Override
    public List<About> getPortfolio() {
        return portfolioRepo.findAll();
    }

    @Override
    public void addPortfolio(UUID id, String name, String profile, Long mob, String address) {
        About about = new About(id, name, profile, mob, address);
        portfolioRepo.save(about);
    }
}
