package org.dock.dto;

import lombok.*;
import org.dock.entities.ContaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TransacaoDTO {

    private Long id;

    private ContaDTO conta;

    private BigDecimal valor;

    private Instant dataTransacao;

}
