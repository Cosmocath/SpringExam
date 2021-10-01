package com.example.springexam.controllers;

import com.example.springexam.models.Patient;
import com.example.springexam.services.interfaces.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    public PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping("")
    public List<Patient> trouverListePatients() {
        return patientService.trouverListePatients();
    }
    @PostMapping
    public Patient creer(@RequestBody Patient patient) {
        return patientService.creer(patient);
    }

    @GetMapping("{id}")
    public Optional<Patient> trouverPatientParId(@PathVariable Long id) {
        return patientService.trouverPatientParId(id);
    }

    @DeleteMapping("{id}")
    public void supprimerClientParId(@PathVariable Long id) {
        patientService.supprimerClientParId(id);
    }
}
