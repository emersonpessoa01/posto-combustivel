package br.com.emersopessoa.posto_combustivel.controller;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.TiposDeCombustivel;
import br.com.emersopessoa.posto_combustivel.infrastrucure.repositories.TiposDeCombustivelRepository;
import br.com.emersopessoa.posto_combustivel.service.TiposDeCombustiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tiposDeCombustivel")
public class TiposDeCombustivelController {
    private final TiposDeCombustiveService tiposDeCombustiveService;

    @PostMapping
    public ResponseEntity<Void>criar(@RequestBody TiposDeCombustivel tiposDeCombustivel){
        tiposDeCombustiveService.criar(tiposDeCombustivel);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<TiposDeCombustivel>> buscarTiposDeCombustivel(){
        return ResponseEntity.ok(tiposDeCombustiveService.buscarTiposDeCombustivel());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TiposDeCombustivelRepository> buscarTiposDeCombustivelPorId(@PathVariable(name="id") Long id){
        return ResponseEntity.ok(tiposDeCombustiveService.buscarTiposDeCombustivelPorId(id));
    }
    @PutMapping
    public ResponseEntity<Void>alterarTiposDeCombustivel(@RequestParam(name="id") Long id, @RequestBody TiposDeCombustivel tiposDeCombustivel){
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTiposDeCombustivelPorId(@PathVariable(name="id") Long id){
        tiposDeCombustiveService.deletarTipoDeCombustivel(id);
        return ResponseEntity.ok().build();
    }
}
