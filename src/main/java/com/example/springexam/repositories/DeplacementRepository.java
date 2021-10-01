package com.example.springexam.repositories;

import com.example.springexam.models.Deplacement;
import com.example.springexam.models.Infirmiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Long> {
}
