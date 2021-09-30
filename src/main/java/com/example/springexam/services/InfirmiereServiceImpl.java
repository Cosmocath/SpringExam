package com.example.springexam.services;

import com.example.springexam.models.Infirmiere;
import com.example.springexam.repositories.InfirmiereRepository;
import com.example.springexam.services.interfaces.InfirmiereService;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements InfirmiereService {

    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> trouverListeInfirmieres() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Infirmiere creer(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Optional<Infirmiere> trouverInfirmiereParId(Long along) {
        return this.infirmiereRepository.findById(along);
    }

    @Override
    public void supprimerInfirmiereParId(Long along) {
        this.infirmiereRepository.deleteById(along);

    }
}
