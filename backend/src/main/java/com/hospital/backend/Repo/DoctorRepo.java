package com.hospital.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.backend.Models.DoctorModel;

public interface DoctorRepo extends JpaRepository<DoctorModel, Long>  {
    
}
