package com.autonomo.smartcar.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.autonomo.smartcar.model.Frota;
import com.autonomo.smartcar.repository.FrotaRepository;

public class FrotaForm {

	@NotNull @NotEmpty @Length(min = 1)
	private String nome;
	@NotNull @NotEmpty @Length(min = 1)
	private String zona;
	@NotNull
	private Integer quantidadeVeiculos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public Integer getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}
	public void setQuantidadeVeiculos(Integer quantidadeVeiculos) {
		this.quantidadeVeiculos = quantidadeVeiculos;
	}
	
	public Frota convert() {
		return new Frota(nome, zona, quantidadeVeiculos);
	}
	
	public Frota atualizar(Long id, FrotaRepository repository) {
		Frota frota = repository.getOne(id);
		frota.setNome(this.nome);
		frota.setZona(this.zona);
		frota.setQuantidadeVeiculos(this.quantidadeVeiculos);
		return frota;
	}
}
