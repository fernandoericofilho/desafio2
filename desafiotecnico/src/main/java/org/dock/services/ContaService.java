package org.dock.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dock.dto.ContaDTO;
import org.dock.dto.TransacaoDTO;
import org.dock.entities.ContaEntity;
import org.dock.entities.TransacaoEntity;
import org.dock.mappers.ContaMapper;
import org.dock.repositories.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ContaService {

    private final ContaRepository contaRepository;
    private final ContaMapper contaMapper;

    public Long save(@NonNull final ContaDTO contaDTO) {

        final Optional<ContaEntity> contaEntity = Optional.of(contaDTO)
                .map(e -> contaMapper.toEntity(contaDTO))
                .map(contaRepository::save);

        return contaEntity.get().getId();
    }
}

