package org.dock.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dock.dto.ContaDTO;
import org.dock.entities.ContaEntity;
import org.dock.mappers.ContaMapper;
import org.dock.repositories.ContaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContaService {

    private final ContaRepository contaRepository;
    private final ContaMapper contaMapper;

    public Long salvar(@NonNull final ContaDTO contaDTO) {

        final Optional<ContaEntity> contaEntity = Optional.of(contaDTO)
                .map(e -> contaMapper.toEntity(contaDTO))
                .map(contaRepository::save);

        return contaEntity.get().getId();
    }

    public void adicionarSaldo(Long contaId, BigDecimal valorAdicionado) {

        final Optional<ContaEntity> contaEntity = contaRepository.findById(contaId);
        contaEntity.flatMap(s -> contaEntity)
                .map(e -> getContaComSaldoAtualizado(e, valorAdicionado))
                .map(contaRepository::save);
    }

    public void sacarSaldo(Long contaId, BigDecimal valorAdicionado) {

        final Optional<ContaEntity> contaEntity = contaRepository.findById(contaId);
        contaEntity.flatMap(s -> {
                    return contaEntity;
                })
                .map(e -> getContaComSaldoAtualizado(e, valorAdicionado.negate()))
                .map(contaRepository::save);
    }

    public void alterarStatusConta(Long contaId, Boolean statusConta) {

        final Optional<ContaEntity> contaEntity = contaRepository.findById(contaId);
        contaEntity.flatMap(s -> contaEntity)
                .map(e -> {
                    e.setAtivo(statusConta);
                    return e;
                })
                .map(contaRepository::save);
    }

    public BigDecimal consultarSaldo(Long contaId) {
        return contaRepository.findById(contaId).get().getSaldo();
    }


    private ContaEntity getContaComSaldoAtualizado(ContaEntity entity, BigDecimal valorAdicionado) {
        entity.setSaldo(entity.getSaldo().add(valorAdicionado));
        return entity;
    }
}

