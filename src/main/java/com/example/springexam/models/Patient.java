package com.example.springexam.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

enum Sexe {
    H,
    F,
}

@Entity
@Table(name = "patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateDeNaissance")
    private Date dateDeNaissance;

    @Column(columnDefinition = "ENUM('H', 'F')")
    @Enumerated(EnumType.STRING)
    private Sexe sexe;

    @Column(name = "numeroSecuriteSociale")
    private String numeroSecuriteSocial;

    @ManyToOne(cascade = CascadeType.ALL)
    /**@JoinColumn(name="adresse_id", nullable=false)**/
    private Adresse adresse;

    @ManyToOne(cascade = CascadeType.ALL)
    /**@JoinColumn(name="infirmiere_id", nullable=false)**/
    private Infirmiere infirmiere;


}
