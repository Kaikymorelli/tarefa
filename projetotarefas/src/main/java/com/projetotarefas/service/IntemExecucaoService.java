package com.projetotarefas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetotarefas.entities.IntemExecucao;
import com.projetotarefas.repository.IntemExecucaoRepository;

@Service
public class IntemExecucaoService {
	private final IntemExecucaoRepository intemExecucaoRepository;
	
	@Autowired
	public IntemExecucaoService(IntemExecucaoRepository intemExecucaoRepository) {
		this.intemExecucaoRepository = intemExecucaoRepository;
	}
	
	public List<IntemExecucao> getAllIntemExecucao() {
		return intemExecucaoRepository.findAll();
	}

	public IntemExecucao getIntemExecucaoById(Long id) {
		Optional<IntemExecucao> IntemExecucao = intemExecucaoRepository.findById(id);
		return IntemExecucao.orElse(null);
	}

	public IntemExecucao salvarIntemExecucao(IntemExecucao intemExecucao) {
		return intemExecucaoRepository.save(intemExecucao);
	}

	public IntemExecucao updateIntemExecucao(Long id, IntemExecucao updatedIntemExecucao) {
		Optional<IntemExecucao> existingIntemExecucao = intemExecucaoRepository.findById(id);
		if (existingIntemExecucao.isPresent()) {
			updatedIntemExecucao.setId(id);
			return intemExecucaoRepository.save(updatedIntemExecucao);
		}
		return null;
	}

	public boolean deleteIntemExecucao(Long id) {
		Optional<IntemExecucao> existingIntemExecucao = intemExecucaoRepository.findById(id);
		if (existingIntemExecucao.isPresent()) {
			intemExecucaoRepository.deleteById(id);
			return true;
		}
		return false;
	}


}
