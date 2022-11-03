package org.dock.controllers;

import lombok.RequiredArgsConstructor;
import org.dock.dto.TransacaoDTO;
import org.dock.services.TransacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
@RequiredArgsConstructor
public class TransacaoController {

    private final TransacaoService transacaoService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Long save(@RequestBody final TransacaoDTO transacaoDTO) {
        return transacaoService.save(transacaoDTO);
    }
}
