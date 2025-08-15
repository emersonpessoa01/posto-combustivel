package br.com.emersopessoa.posto_combustivel.service;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.TiposDeCombustivel;
import br.com.emersopessoa.posto_combustivel.infrastrucure.repositories.TiposDeCombustivelRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class TiposDeCombustiveService {
    private final TiposDeCombustivelRepository tiposDeCombustivelRepository;

    public void criar(TiposDeCombustivel tiposDeCombustivel) {
        tiposDeCombustivelRepository.save(tiposDeCombustivel);
    }

    public TiposDeCombustivelRepository buscarTiposDeCombustivelPorId(Long id) {
        return tiposDeCombustivelRepository.findById(id).orElseThrow(()-> new NullPointerException("Tipo de combustívelnão encontrado pelo id" + id));
                
    }

    public List<TiposDeCombustivel> buscarTiposDeCombustivel() {
        return tiposDeCombustivelRepository.findAll();
    }

    public TiposDeCombustivel alterarTiposDeCombustivel(Long id, TiposDeCombustivel tiposDeCombustivel) {
        TiposDeCombustivel bomba = (TiposDeCombustivel) buscarTiposDeCombustivelPorId(id);
        tiposDeCombustivel.setId(bomba.getId());
        tiposDeCombustivelRepository.save(tiposDeCombustivel);
        return bomba;

    }
    @Transactional
    public void deletarTipoDeCombustivel(Long id){
        tiposDeCombustivelRepository.deleteById(id);
    }
}
