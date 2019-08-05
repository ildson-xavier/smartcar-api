package com.autonomo.smartcar.controller.dto;

import java.time.LocalDateTime;

import com.autonomo.smartcar.model.Veiculo;

public class VeiculoDto {

	private Long id;
	private String status;
	private Double temperatura;
	private Double nivelDoCombustivel;
	private LocalDateTime dataCriacao;
	
	public VeiculoDto(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.status = veiculo.getStatus();
		this.temperatura = veiculo.getTemperatura();
		this.nivelDoCombustivel = veiculo.getNivelDoCombustivel();
		this.dataCriacao = veiculo.getDataCriacao();
	}

	public Long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public Double getNivelDoCombustivel() {
		return nivelDoCombustivel;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	
	
}
