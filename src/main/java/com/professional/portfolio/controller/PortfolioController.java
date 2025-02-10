package com.professional.portfolio.controller;

import com.professional.portfolio.model.About;
import com.professional.portfolio.service.PortfolioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/portfolio")
@Tag(name = "Portfolio Controller", description = "API for managing portfolio")
public class PortfolioController {

    private final PortfolioService portfolioService;

    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @Operation(summary = "Get portfolio")
    @GetMapping("/get")
    public List<About> getPortfolioResponse() {
        return portfolioService.getPortfolio();
    }

    @Operation(summary = "Add portfolio")
    @PostMapping("/add/{name}/{profile}/{mob}/{address}")
    public void addPortfolioResponse(@PathVariable String name, @PathVariable String profile, @PathVariable Long mob, @PathVariable String address) {
        portfolioService.addPortfolio(UUID.randomUUID(), name, profile, mob, address);
    }

//    @Operation(summary = "Add portfolio")
//    @GetMapping("/add/{path}")
//    public List<About> addPortfolioResponse(@PathVariable String name, @PathVariable String profile, @PathVariable Long mob, @PathVariable String address) {
//        return portfolioService.addPortfolio(name, profile, mob, address);
//    }
}
