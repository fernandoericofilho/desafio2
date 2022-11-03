package org.dock.controllers;

import lombok.RequiredArgsConstructor;
import org.dock.dto.PessoaDTO;
import org.dock.services.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void save(@RequestBody final PessoaDTO pessoaDTO) {
        pessoaService.save(pessoaDTO);
    }
}
