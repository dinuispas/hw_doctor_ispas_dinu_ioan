package com.example.practice.service;

import com.example.practice.exceptions.NoDoctorException;
import lombok.RequiredArgsConstructor;
import com.example.practice.model.Doctor;
import com.example.practice.model.Patient;
import com.example.practice.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.practice.repostiory.DoctorRepository;
import com.example.practice.repostiory.PatientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {


    @Autowired
    final DoctorRepository doctorRepository;
    @Autowired
    final PatientRepository patientRepository;
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer patientId)throws NoDoctorException{

        Doctor d = doctorRepository.getById(doctorId);
        if(d == null) {
            throw new NoDoctorException();
        }else{
            Patient p = patientRepository.getById(patientId);
            if(p!= null){
                d.setPatient(p);
            }
        }


    }

    public List<Doctor> getAllBySpecialty(Specialty specialty){
        return getAllBySpecialty(specialty);
    }

    public void saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }





}
