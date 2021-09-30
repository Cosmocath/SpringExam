package com.example.springexam.services.interfaces;

import com.example.springexam.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    public List<Patient> trouverListePatients();
    public Patient creer(Patient patient);
    public Optional<Patient> trouverPatientParId(Long along);
    public void supprimerClientParId(Long along);
}
