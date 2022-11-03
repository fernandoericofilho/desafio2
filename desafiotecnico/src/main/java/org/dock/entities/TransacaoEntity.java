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
@Table(name = "transacao")
@Entity(name = "transacao")
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao", columnDefinition = "serial", nullable = false, updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_conta", nullable = false)
    private ContaEntity conta;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @CreationTimestamp
    @Column(name = "data_transacao", updatable = false)
    private Instant dataTransacao;

}
