package com.example.springexam.controllers;

import com.example.springexam.models.Infirmiere;
import com.example.springexam.services.interfaces.InfirmiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {
    private InfirmiereService infirmiereService;

    public InfirmiereController(InfirmiereService infirmiereService) {
        this.infirmiereService = infirmiereService;
    }
    @GetMapping("")
    public List<Infirmiere> trouverListeInfirmieres() {
        return infirmiereService.trouverListeInfirmieres();
    }
    @PostMapping
    public Infirmiere creer(@RequestBody Infirmiere infirmiere) {
        return infirmiereService.creer(infirmiere);
    }
    @GetMapping("{id}")
    public Optional<Infirmiere> trouverInfirmiereParId(Long along) {
        return infirmiereService.trouverInfirmiereParId(along);
    }
    @DeleteMapping("{id}")
    public void supprimerInfirmiereParId(@PathVariable Long along) {
        infirmiereService.supprimerInfirmiereParId(along);
    }
}
