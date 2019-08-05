package com.autonomo.smartcar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.autonomo.smartcar.model.Frota;

public interface FrotaRepository extends JpaRepository<Frota, Long>{

	public Optional<Frota> findByZona(String zona);
	
	@Query("SELECT f FROM Frota f WHERE zona = :zona")
	public List<Frota> carregarFrotaPorZona(@Param("zona") String zona);

	
}
