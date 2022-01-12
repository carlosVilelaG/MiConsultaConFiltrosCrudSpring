package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gestion.productos.entidades.Producto;

public interface IProductoRepositorio extends JpaRepository<Producto, Long> {

	@Query("select p from Producto p where p.nombre like %?1% "
			+ " or p.marca like %?1% "
	        + " or p.hechoEn like %?1% ")
	public List<Producto> findAll(String palabraClave);
}
