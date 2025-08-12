package br.com.emersopessoa.posto_combustivel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.BombasDeCombustivel;
import br.com.emersopessoa.posto_combustivel.infrastrucure.repositories.BombasDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {
    private final BombasDeCombustivelRepository bombasDeCombustivelRepository;

    // filepath: BombaDeCombustivelService.java
    public void criar(BombasDeCombustivel bombasDeCombustivel) {
        bombasDeCombustivelRepository.save(bombasDeCombustivel);
    }
    // ...existing code...

    public BombasDeCombustivel buscarBombasDeCombustivelPorId(Long id) {
        return bombasDeCombustivelRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Bomba de combustível não encontrada pelo id" + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel() {
        return bombasDeCombustivelRepository.findAll();
    }

    @Transactional
    public void alterarBombaCombustivel(Long id, BombasDeCombustivel bombaDeCombustivel) {
        BombasDeCombustivel bomba = buscarBombasDeCombustivelPorId(id);
        bombaDeCombustivel.setId(bomba.getId());
    }

    @Transactional
    public void deletarBombaCombusivel(Long id) {
        bombasDeCombustivelRepository.deleteById(id);
    }

}
