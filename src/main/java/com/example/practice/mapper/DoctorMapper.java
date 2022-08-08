package com.example.practice.mapper;

import com.example.practice.DTO.DoctorDto;
import com.example.practice.model.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDoctorDto(Doctor doctor);

}
