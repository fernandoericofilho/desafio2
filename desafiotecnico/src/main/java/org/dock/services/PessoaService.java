package org.dock.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dock.dto.PessoaDTO;
import org.dock.entities.PessoaEntity;
import org.dock.exceptions.PessoaException;
import org.dock.filters.PessoaCPFValidation;
import org.dock.mappers.PessoaMapper;
import org.dock.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final PessoaCPFValidation pessoaCPFValidation;
    private final PessoaMapper pessoaMapper;

    public Long save(@NonNull final PessoaDTO pessoaDTO) {
        Optional.of(pessoaDTO)
                .filter(pessoaCPFValidation::filter)
                .orElseThrow(PessoaException::new);

        final Optional<PessoaEntity> pessoaEntity = Optional.of(pessoaDTO)
                .map(e -> pessoaMapper.toEntity(pessoaDTO))
                .map(pessoaRepository::save);

        return pessoaEntity.get().getId();
    }
}

