package com.example.practice.service;

import com.example.practice.repostiory.VisitRepository;
import lombok.RequiredArgsConstructor;
import com.example.practice.model.Doctor;
import com.example.practice.model.Patient;
import com.example.practice.model.Specialty;
import com.example.practice.model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practice.repostiory.PatientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    final PatientRepository patientRepository;
    final VisitRepository visitRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public List<Patient> getAllByDoctor(Doctor doctor){
        return patientRepository.getAllByDoctor(doctor);
    }

    public Patient getById(Integer patientId){
        return patientRepository.getById(patientId);
    }

    public List<Visit> getAllVisitsByCnpAndSpecialty(String cnp, Specialty specialty){
        return visitRepository.getAllByPatient_CnpAndDoctor_Specialty(cnp,specialty);
    }


}
