package com.autonomo.smartcar.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Frota implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String zona;
	@ManyToOne
	private Usuario usuario;
	private Integer quantidadeVeiculos;
	@JsonIgnore
	@OneToMany(mappedBy = "frota", cascade = CascadeType.ALL)
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Frota() {
		super();
	}

	public Frota(String nome, String zona, Integer quantidadeVeiculos) {
		super();
		this.nome = nome;
		this.zona = zona;
		this.quantidadeVeiculos = quantidadeVeiculos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frota other = (Frota) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public Integer getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}

	public void setQuantidadeVeiculos(Integer quantidadeVeiculos) {
		this.quantidadeVeiculos = quantidadeVeiculos;
	}

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


}
