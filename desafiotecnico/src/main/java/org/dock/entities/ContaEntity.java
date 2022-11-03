package org.dock.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "conta")
@Entity(name = "conta")
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta", columnDefinition = "serial", nullable = false, updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private PessoaEntity pessoa;

    @Column(name = "saldo", nullable = false)
    private BigDecimal saldo;

    @Column(name = "limite_saque_diario", nullable = false)
    private BigDecimal limiteSaqueDiario;

    @Column(name = "flag_ativo", nullable = false)
    private Boolean ativo;

    @Column(name = "tipo_conta", nullable = false)
    private Integer tipoConta;

    @CreationTimestamp
    @Column(name = "data_criacao", updatable = false)
    private Instant dataCriacao;

}
