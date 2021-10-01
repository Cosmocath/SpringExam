package com.example.springexam.services;

import com.example.springexam.models.Deplacement;
import com.example.springexam.repositories.DeplacementRepository;
import com.example.springexam.services.interfaces.DeplacementService;

import java.util.List;
import java.util.Optional;

public class DeplacementServiceImpl implements DeplacementService {

    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository) {
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> trouverListeDeplacements() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Deplacement creer(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Optional<Deplacement> trouverDeplacementParId(Long along) {
        return this.deplacementRepository.findById(along);
    }

    @Override
    public void supprimerDeplacementParId(Long along) {
        this.deplacementRepository.deleteById(along);

    }
}
