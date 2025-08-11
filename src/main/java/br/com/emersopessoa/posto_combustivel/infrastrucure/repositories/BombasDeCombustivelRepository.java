package br.com.emersopessoa.posto_combustivel.infrastrucure.repositories;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombasDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Long> {
}
