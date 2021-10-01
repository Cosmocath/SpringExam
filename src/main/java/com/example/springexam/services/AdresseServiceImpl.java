package com.example.springexam.services;

import com.example.springexam.models.Adresse;
import com.example.springexam.repositories.AdresseRepository;
import com.example.springexam.services.interfaces.AdresseService;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @Override
    public List<Adresse> trouverListeAdresses() {
        return this.adresseRepository.findAll();
    }

    @Override
    public Adresse creer(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public Optional<Adresse> trouverAdresseParId(Long along) {
        return this.adresseRepository.findById(along);
    }

    @Override
    public void supprimerAdresseParId(Long along) {
        this.adresseRepository.deleteById(along);

    }
}
