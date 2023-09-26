package com.projetotarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetotarefas.entities.IntemExecucao;
import com.projetotarefas.service.IntemExecucaoService;

@RestController
@RequestMapping("/execucao")
public class ItemExecucaoController {
	
	private final IntemExecucaoService intemExecucaoService;
	
	@Autowired
	public ItemExecucaoController(IntemExecucaoService intemExecucaoService) {
		this.intemExecucaoService = intemExecucaoService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<IntemExecucao> getIntemExecucaoyId(@PathVariable Long id) {
		IntemExecucao intemExecucao = intemExecucaoService.getIntemExecucaoById(id);
		if (intemExecucao != null) {
			return ResponseEntity.ok(intemExecucao);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/")
	public ResponseEntity<List<IntemExecucao>> getAllIntemExecucao() {
		List<IntemExecucao> intemExecucao = intemExecucaoService.getAllIntemExecucao();
		return ResponseEntity.ok(intemExecucao);
	}

	@PostMapping("/")
	public ResponseEntity<IntemExecucao> criarIntemExecucao(@RequestBody IntemExecucao intemExecucao) {
		IntemExecucao criarIntemExecucao = intemExecucaoService.salvarIntemExecucao(intemExecucao);
		return ResponseEntity.status(HttpStatus.CREATED).body(intemExecucao);
	}


	@PutMapping("/{id}")
	public ResponseEntity<IntemExecucao> updateIntemExecucao(@PathVariable Long id, @RequestBody IntemExecucao intemExecucao) {
		IntemExecucao updatedIntemExecucao = intemExecucaoService.updateIntemExecucao(id, intemExecucao);
		if (updatedIntemExecucao != null) {
			return ResponseEntity.ok(updatedIntemExecucao);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteIntemExecucao(@PathVariable Long id) {
		boolean deleted = intemExecucaoService.deleteIntemExecucao(id);
		if (deleted) {
			return ResponseEntity.ok().body("O produto foi excluído com sucesso.");
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	
	
}
