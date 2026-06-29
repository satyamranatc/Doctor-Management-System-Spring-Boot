package com.hospital.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.backend.Models.PatientModel;

public interface PatientRepo extends JpaRepository<PatientModel, Long>  {
    
}

