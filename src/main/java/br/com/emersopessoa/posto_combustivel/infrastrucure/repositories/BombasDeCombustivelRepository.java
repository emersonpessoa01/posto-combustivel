package br.com.emersopessoa.posto_combustivel.infrastrucure.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.BombasDeCombustivel;

public interface BombasDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Long> {

}
