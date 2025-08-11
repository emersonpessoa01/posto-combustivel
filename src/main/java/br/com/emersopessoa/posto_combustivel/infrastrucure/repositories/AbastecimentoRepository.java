package br.com.emersopessoa.posto_combustivel.infrastrucure.repositories;

import br.com.emersopessoa.posto_combustivel.infrastrucure.entities.Abastecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {
}
