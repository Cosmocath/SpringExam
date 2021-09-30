package com.example.springexam.services;

import com.example.springexam.models.Patient;
import com.example.springexam.repositories.PatientRepository;
import com.example.springexam.services.interfaces.PatientService;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> trouverListePatients() {
        return this.patientRepository.findAll();

    }

    @Override
    public Patient creer(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> trouverPatientParId(Long along) {
        return this.patientRepository.findById(along);
    }

    @Override
    public void supprimerClientParId(Long along) {
        this.patientRepository.deleteById(along);

    }
}
