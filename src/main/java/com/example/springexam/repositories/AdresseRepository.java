package com.example.springexam.repositories;

import com.example.springexam.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository  extends JpaRepository<Adresse, Long> {
}
