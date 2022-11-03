package org.dock.controllers;

import lombok.RequiredArgsConstructor;
import org.dock.dto.ContaDTO;
import org.dock.services.ContaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contas")
@RequiredArgsConstructor
public class ContaController {

    private final ContaService contaService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Long save(@RequestBody final ContaDTO contaDTO) {
        return contaService.save(contaDTO);
    }
}
