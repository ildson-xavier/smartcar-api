package com.autonomo.smartcar.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.autonomo.smartcar.controller.dto.DetalheFrotaDTO;
import com.autonomo.smartcar.controller.dto.FrotaDTO;
import com.autonomo.smartcar.controller.form.FrotaForm;
import com.autonomo.smartcar.model.Frota;
import com.autonomo.smartcar.repository.FrotaRepository;

@RestController
@RequestMapping("/frota")
public class FrotaController {

	@Autowired
	private FrotaRepository frotaRepository;

	@GetMapping
	public List<FrotaDTO> listar() {

		List<Frota> frotas = frotaRepository.findAll();
		return FrotaDTO.convert(frotas);
	}

	@PostMapping
	public ResponseEntity<FrotaDTO> cadastrar(@RequestBody @Valid FrotaForm form, UriComponentsBuilder builder) {
		Frota frota = form.convert();
		frotaRepository.save(frota);

		URI uri = builder.path("/frota/{id}").buildAndExpand(frota.getId()).toUri();
		return ResponseEntity.created(uri).body(new FrotaDTO(frota));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalheFrotaDTO> getFrota(@PathVariable Long id) {
		Optional<Frota> frota = frotaRepository.findById(id);
		if (frota.isPresent()) {
			return ResponseEntity.ok(new DetalheFrotaDTO(frota.get()));
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/zona/{zona}")
	public ResponseEntity<DetalheFrotaDTO> getFrotaZona(@PathVariable String zona) {
		Optional<Frota> frota = frotaRepository.findByZona(zona.toUpperCase());
		if (frota.isPresent()) {
			return ResponseEntity.ok(new DetalheFrotaDTO(frota.get()));
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<FrotaDTO> atualizar(@PathVariable Long id, @RequestBody @Valid FrotaForm form) {
		Frota frota = form.atualizar(id, frotaRepository);

		return ResponseEntity.ok(new FrotaDTO(frota));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id) {
		frotaRepository.deleteById(id);
		return ResponseEntity.ok().build();

	}

}
