package org.dock.dto;

import lombok.*;
import org.dock.entities.PessoaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ContaDTO {

    private Long id;
    private PessoaDTO pessoa;
    private BigDecimal saldo;
    private BigDecimal limiteSaqueDiario;
    private Boolean ativo;
    private Integer tipoConta;
    private Instant dataCriacao;

}
