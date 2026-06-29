package com.hospital.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.backend.Models.AppointmentModel;

public interface AppointmentRepo extends JpaRepository<AppointmentModel, Long>  {
    
}
