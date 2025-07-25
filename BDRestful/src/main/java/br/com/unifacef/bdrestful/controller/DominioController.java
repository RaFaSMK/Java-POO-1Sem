package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Dominio;
import br.com.unifacef.bdrestful.service.DominioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dominio")
public class DominioController {

    DominioService dominioService;

    public DominioController(DominioService dominioService){
        this.dominioService = dominioService;
    }

    @GetMapping
    public List<Dominio> getDominios(){
        return dominioService.getDominios();
    }

    @PostMapping
    public Dominio addDominio(@RequestBody Dominio dominio){
        return dominioService.addDominio(dominio);
    }
}
