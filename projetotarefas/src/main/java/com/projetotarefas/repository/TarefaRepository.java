package com.projetotarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetotarefas.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
