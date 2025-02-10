package com.professional.portfolio.repository;


import com.professional.portfolio.model.About;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "profileRepo")
@Scope(value = "singleton")
public interface PortfolioRepo extends JpaRepository<About, Integer> {
    List<About> findByName(String name);
}
