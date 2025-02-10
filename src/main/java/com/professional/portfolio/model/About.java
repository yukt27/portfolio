package com.professional.portfolio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "portfolio_details")
public class About {

        public About(Object object, String name, String profile, Long mobileNumber, String address) {}

        @Id
        @Column(name = "portfolio_id")
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;

        @Column(name = "portfolio_name", columnDefinition = "TEXT")
        private String name;

        @Column(name = "portfolio_profile", columnDefinition = "TEXT")
        private String profile;

        @Column(name = "portfolio_mobile")
        private Long mobileNumber;

        @Column(name = "portfolio_address", columnDefinition = "TEXT")
        private String address;

}
