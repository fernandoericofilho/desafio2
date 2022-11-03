package org.dock.filters;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.dock.dto.PessoaDTO;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaCPFValidation implements PessoaFilter {

    public static final int CPF_LENGTH_CORRECT_VALUE = 11;

    @Override
    public boolean filter(@NonNull PessoaDTO pessoaDTO) {
        return containsAllCpfDigits(pessoaDTO.getCpf());
    }

    private Boolean containsAllCpfDigits(final String cpf) {
        return !cpf.isEmpty() && cpf.length() == CPF_LENGTH_CORRECT_VALUE;
    }
}
