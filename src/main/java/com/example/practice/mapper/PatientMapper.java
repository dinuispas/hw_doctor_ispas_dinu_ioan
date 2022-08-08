package com.example.practice.mapper;

import com.example.practice.DTO.PatientDto;
import com.example.practice.model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDto toPatientDto(Patient patient);
}
