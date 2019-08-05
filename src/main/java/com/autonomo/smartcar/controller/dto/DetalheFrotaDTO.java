package com.autonomo.smartcar.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.autonomo.smartcar.model.Frota;

public class DetalheFrotaDTO {

	private Long id;
	private String nome;
	private String zona;
	private Integer quantidadeVeiculos;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private List<VeiculoDto> veiculos;
	
	public DetalheFrotaDTO(Frota frota) {
		this.id = frota.getId();
		this.nome = frota.getNome();
		this.zona = frota.getZona();
		this.quantidadeVeiculos = frota.getQuantidadeVeiculos();
		this.nomeAutor = frota.getUsuario().getNome();
		this.veiculos = new ArrayList<>();
		this.veiculos.addAll(frota.getVeiculos().stream().map(VeiculoDto::new).collect(Collectors.toList()));
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

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public List<VeiculoDto> getVeiculos() {
		return veiculos;
	}
	
		
}
