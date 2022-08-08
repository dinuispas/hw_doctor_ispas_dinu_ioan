package com.example.practice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.practice.model.Doctor;
import com.example.practice.model.Specialty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
    String name;
    Specialty specialty;

    public DoctorDto(Doctor doctor){
        this.name = doctor.getName();
        this.specialty = doctor.getSpecialty();
    }
}
