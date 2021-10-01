package com.example.springexam.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "infirmiere")
@Data
public class Infirmiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "numero_professionnel")
    private Integer numero_professionnel;

    @Column(name = "tel_pro")
    private String tel_pro;

    @Column(name = "tel_perso")
    private String tel_perso;

    @ManyToOne
    /**@JoinColumn(name="adresse_id", nullable=false)**/
    private Adresse adresse;
}
