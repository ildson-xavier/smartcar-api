package com.autonomo.smartcar.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.autonomo.smartcar.model.Frota;

public class FrotaDTO {

	private Long id;
	private String nome;
	private String zona;
	private Integer quantidadeVeiculos;
	
	
	public FrotaDTO(Frota frota) {
		super();
		this.id = frota.getId();
		this.nome = frota.getNome();
		this.zona = frota.getZona();
		this.quantidadeVeiculos = frota.getQuantidadeVeiculos();
	}
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getZona() {
		return zona;
	}
	public Integer getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}

	public static List<FrotaDTO> convert(List<Frota> frotas) {
		List<FrotaDTO> lista = new ArrayList<>();
		 frotas.forEach(f -> {
			lista.add(new FrotaDTO(f));
		});
		 return lista;
	}
	
	
}
