package com.example.springexam.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "adresse")
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "cp")
    private String cp;

    @Column(name = "ville")
    private String ville;
}


