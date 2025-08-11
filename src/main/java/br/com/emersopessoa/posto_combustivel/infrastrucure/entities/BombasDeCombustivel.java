package br.com.emersopessoa.posto_combustivel.infrastrucure.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="bombas_de_abastecimento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BombasDeCombustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(name="nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name="combustivel_id")
    private TiposDeCombustivel tiposDeCombustivel;

}
