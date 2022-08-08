package com.example.practice.controller;

import com.example.practice.exceptions.NoDoctorException;
import com.example.practice.model.Doctor;
import com.example.practice.model.Specialty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.practice.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("doctors")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/all?specialty={speciality}")
    public List<Doctor> getAllDoctorsBySpecialty(@RequestParam Specialty specialty, @PathVariable String speciality){
        return doctorService.getAllBySpecialty(specialty);
    }

    @PostMapping("/addPatient/{doctorId}/{patientId}")
    public void addPatient(@PathVariable("doctorId") Integer doctorId,@PathVariable("patientId") Integer patientId)
            throws NoDoctorException {
        doctorService.addPatient(doctorId,patientId);
    }

    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.saveDoctor(doctor);
    }






}
