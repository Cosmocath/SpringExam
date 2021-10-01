package com.example.springexam.controllers;

import com.example.springexam.models.Adresse;
import com.example.springexam.services.interfaces.AdresseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {

    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }
    @GetMapping("")
    public List<Adresse> trouverListeAdresses() {
        return this.adresseService.trouverListeAdresses();
    }

    @PostMapping
    public Adresse creer(@RequestBody Adresse adresse) {
        return this.adresseService.creer(adresse);
    }

    @GetMapping("{id}")
    public Optional<Adresse> trouverAdresseParId(@PathVariable Long id) {
        return this.adresseService.trouverAdresseParId(id);
    }

    @DeleteMapping("{id}")
    public void supprimerAdresseParId(@PathVariable Long id) {
        this.adresseService.supprimerAdresseParId(id);
    }
}
