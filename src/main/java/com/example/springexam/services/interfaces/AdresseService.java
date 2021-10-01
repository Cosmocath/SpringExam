package com.example.springexam.services.interfaces;

import com.example.springexam.models.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    public List<Adresse> trouverListeAdresses();
    public Adresse creer(Adresse adresse);
    public Optional<Adresse> trouverAdresseParId(Long along);
    public void supprimerAdresseParId(Long along);
}
