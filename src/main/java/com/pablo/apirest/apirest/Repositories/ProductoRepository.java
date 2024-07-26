package com.pablo.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablo.apirest.apirest.Entities.Producto;
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
