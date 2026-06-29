package com.hospital.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.backend.Models.PatientModel;
import com.hospital.backend.Repo.PatientRepo;

@RestController
@CrossOrigin("*")
public class PatientController 
{
    @Autowired
    private PatientRepo PatientRepo;

    @GetMapping("/api/Patients/list")
    public List<PatientModel> getPatients()
    {
        return PatientRepo.findAll();
    }

    @PostMapping("/api/Patients/add")
    public void addPatient(@RequestBody PatientModel Patient)
    {
        PatientRepo.save(Patient);
    }
    
}
