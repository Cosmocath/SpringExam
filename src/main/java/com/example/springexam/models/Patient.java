package com.example.springexam.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;



@Entity
@Table(name = "client")
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

    @Column(name = "sexe")
    private Enum sexe;

    @Column(name = "numeroSecuriteSocial")
    private BigInteger numeroSecuriteSocial;


}
