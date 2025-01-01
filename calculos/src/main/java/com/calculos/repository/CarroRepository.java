package com.calculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculos.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long>{
    
}
