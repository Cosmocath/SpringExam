package com.example.springexam.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "deplacement")
@Data
public class Deplacement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "cout")
    private Double cout;

    @ManyToOne
    /**@JoinColumn(name="patient_id", nullable=false)**/
    private Patient patient;

    @ManyToOne
    /**@JoinColumn(name="infirmiere_id", nullable=false)**/
    private Infirmiere infirmiere;
}
