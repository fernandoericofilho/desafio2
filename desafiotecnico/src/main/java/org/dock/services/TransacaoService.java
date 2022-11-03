package org.dock.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dock.dto.PessoaDTO;
import org.dock.dto.TransacaoDTO;
import org.dock.entities.PessoaEntity;
import org.dock.entities.TransacaoEntity;
import org.dock.exceptions.PessoaException;
import org.dock.filters.PessoaCPFValidation;
import org.dock.mappers.PessoaMapper;
import org.dock.mappers.TransacaoMapper;
import org.dock.repositories.PessoaRepository;
import org.dock.repositories.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;
    private final TransacaoMapper transacaoMapper;

    public Long save(@NonNull final TransacaoDTO transacaoDTO) {

        final Optional<TransacaoEntity> transacaoEntity = Optional.of(transacaoDTO)
                .map(e -> transacaoMapper.toEntity(transacaoDTO))
                .map(transacaoRepository::save);

        return transacaoEntity.get().getId();
    }
}

