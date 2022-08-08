package com.example.practice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.practice.observer.PatientObserver;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends Observable {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull

    private String cnp;
    @NotNull

    @OneToMany
    List<Visit> visits = new ArrayList<>();

    @NotNull
    @ManyToOne
    Doctor doctor;
    @Transient
    PatientObserver patientObserver;

    public void setDoctor(Doctor doctor){

        this.doctor = doctor;
        patientObserver.update(this, patientObserver);

    }


}
