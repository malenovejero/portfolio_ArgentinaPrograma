
package com.portfolio.Portfolio.security.entity;

import com.portfolio.Portfolio.security.enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
}
