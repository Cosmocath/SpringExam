package com.example.springexam.controllers;

import com.example.springexam.models.Deplacement;
import com.example.springexam.services.interfaces.DeplacementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

    private DeplacementService deplacementService;

    public DeplacementController(DeplacementService deplacementService) {
        this.deplacementService = deplacementService;
    }

    @GetMapping("")
    public List<Deplacement> trouverListeDeplacements() {
        return this.deplacementService.trouverListeDeplacements();
    }

    @PostMapping
    public Deplacement creer(@RequestBody Deplacement deplacement) {
        return this.deplacementService.creer(deplacement);
    }

    @GetMapping("{id}")
    public Optional<Deplacement> trouverDeplacementParId(@PathVariable Long id) {
        return this.deplacementService.trouverDeplacementParId(id);
    }

    @DeleteMapping("{id}")
    public void supprimerDeplacementParId(@PathVariable Long id) {
        this.deplacementService.supprimerDeplacementParId(id);
    }
}
