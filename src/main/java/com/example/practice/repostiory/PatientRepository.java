package com.example.practice.repostiory;

import com.example.practice.model.Doctor;
import com.example.practice.model.Patient;
import com.example.practice.model.Specialty;
import com.example.practice.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Integer>
{
    List<Patient> findAll();
    Patient getPatientById(Integer id);

    List<Patient> getAllByDoctor(Doctor doctor);


}
