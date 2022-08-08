package com.example.practice.controller;

import com.example.practice.model.Patient;
import com.example.practice.model.Specialty;
import com.example.practice.model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.practice.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Integer id){
        return patientService.getById(id);
    }

    @GetMapping("/visits/{cnp}/{specialty}")
    public List<Visit> getAllVisitsByCnpAndSpecialty(@PathVariable String cnp, @PathVariable Specialty specialty){
        return patientService.getAllVisitsByCnpAndSpecialty(cnp,specialty);
    }





}
