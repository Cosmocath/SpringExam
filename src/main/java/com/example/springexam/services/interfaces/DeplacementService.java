package com.example.springexam.services.interfaces;

import com.example.springexam.models.Deplacement;

import java.util.List;
import java.util.Optional;

public interface DeplacementService {
    public List<Deplacement> trouverListeDeplacements();
    public Deplacement creer(Deplacement deplacement);
    public Optional<Deplacement> trouverDeplacementParId(Long along);
    public void supprimerDeplacementParId(Long along);
}



