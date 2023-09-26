package com.projetotarefas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "execucao")
public class IntemExecucao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	@Column (name = "Percentual")
	private double percentual;

	@NotNull
	@NotBlank
	@Column (name = "Descricao")
	private String descricao;

	@NotNull
	@NotBlank
	@Column (name = "Dataexecucao")
	private String dataexecucao;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getpercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataexecucao() {
		return dataexecucao;
	}

	public void setDataexecucao(String dataexecucao) {
		this.dataexecucao = dataexecucao;
	}

}
