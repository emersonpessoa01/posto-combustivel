package br.com.emersopessoa.posto_combustivel.controller;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.BombasDeCombustivel;
import br.com.emersopessoa.posto_combustivel.service.BombaDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bombasDeCombustivel")
public class BombasDeCombustivelController {
    private final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void>criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.criar(bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscarBombasCombustivel(){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombasDeCombustivel());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel>buscarBombasDeCombustivelPorId(@PathVariable(name="id")Long id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombasDeCombustivelPorId(id));
    }
    @PutMapping
    public ResponseEntity<Void>alterarBombaDeCombustivel(@RequestParam(name="id")Long id, @RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.alterarBombaCombustivel(id,bombasDeCombustivel);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBombasDeCombustivelPorId(@PathVariable(name="id") Long id){
        bombaDeCombustivelService.deletarBombaCombusivel(id);
        return ResponseEntity.ok().build();
    }
}
