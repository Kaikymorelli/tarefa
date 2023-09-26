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
@Table(name = "terefa")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@NotBlank
	@Column (name = "nome")
	private String nome;

	@NotNull
	@NotBlank
	@Column (name = "DatalimiteExecucao")
	private String datalimiteExecucao;

	@NotNull
	@NotBlank
	@Column (name = "DetalhesTarefa")
	private String detalhesTarefa;
	@NotNull
	@NotBlank
	@Column (name = "statusTarefa")
	private String statusTarefa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatalimiteExecucao() {
		return datalimiteExecucao;
	}
	public void setDatalimiteExecucao(String datalimiteExecucao) {
		this.datalimiteExecucao = datalimiteExecucao;
	}

	public String getDetalhesTarefa() {
		return detalhesTarefa;
	}

	public void setDetalhesTarefa(String detalhesTarefa) {
		this.detalhesTarefa = detalhesTarefa;
	}

	public String getstatusTarefa() {
		return statusTarefa;
	}
	public void setstatusTarefa(String statusTarefa) {
		this.statusTarefa = statusTarefa;
	}



}
