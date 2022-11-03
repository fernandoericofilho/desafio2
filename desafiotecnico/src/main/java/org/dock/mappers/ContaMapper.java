package org.dock.mappers;

import lombok.NonNull;
import org.dock.dto.ContaDTO;
import org.dock.entities.ContaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ContaMapper {

    public abstract ContaEntity toEntity(@NonNull ContaDTO ContaDTO);
    public abstract ContaDTO toDTO(@NonNull ContaEntity ContaEntity);

}

