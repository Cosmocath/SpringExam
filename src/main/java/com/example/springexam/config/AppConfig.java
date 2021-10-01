package com.example.springexam.config;

import com.example.springexam.repositories.AdresseRepository;
import com.example.springexam.repositories.DeplacementRepository;
import com.example.springexam.repositories.InfirmiereRepository;
import com.example.springexam.repositories.PatientRepository;
import com.example.springexam.services.AdresseServiceImpl;
import com.example.springexam.services.DeplacementServiceImpl;
import com.example.springexam.services.InfirmiereServiceImpl;
import com.example.springexam.services.PatientServiceImpl;
import com.example.springexam.services.interfaces.AdresseService;
import com.example.springexam.services.interfaces.DeplacementService;
import com.example.springexam.services.interfaces.InfirmiereService;
import com.example.springexam.services.interfaces.PatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PatientService patientService(PatientRepository repo) {
        return new PatientServiceImpl(repo);
    }

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository repo){
        return new InfirmiereServiceImpl(repo);
    }

    @Bean
    public AdresseService adresseService(AdresseRepository repo){
        return new AdresseServiceImpl(repo);
    }

    @Bean
    public DeplacementService deplacementService(DeplacementRepository repo){
        return new DeplacementServiceImpl(repo);
    }

}
