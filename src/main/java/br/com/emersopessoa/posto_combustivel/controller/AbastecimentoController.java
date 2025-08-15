package br.com.emersopessoa.posto_combustivel.controller;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.Abastecimento;
import br.com.emersopessoa.posto_combustivel.service.AbastecimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/abastecimento")
public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;

    @PostMapping
    public ResponseEntity<Void>abastecer(@RequestParam("quantidadeEmLitros") Long litros, @RequestParam("idBomba")Long idBomba){
        abastecimentoService.abastecer(idBomba,litros);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<List<Abastecimento>>buscarAbastecimento(){
        return ResponseEntity.ok(abastecimentoService.buscarAbastecimento());
    }
}
