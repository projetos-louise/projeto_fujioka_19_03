package br.com.fujideia.iesp.tecback.controller;


import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;
    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
        return generoService.salvar(genero);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero){
        return generoService.atualizar(genero);
    }

    @GetMapping
    public List<Genero> listarTodos(){
        return generoService.listarTodos();
    }


}
