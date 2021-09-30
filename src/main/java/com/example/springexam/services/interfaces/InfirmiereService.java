package com.example.springexam.services.interfaces;
import com.example.springexam.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface InfirmiereService {
    public List<Infirmiere> trouverListeInfirmieres();
    public Infirmiere creer(Infirmiere infirmiere);
    public Optional<Infirmiere> trouverInfirmiereParId(Long along);
    public void supprimerInfirmiereParId(Long along);
}
