package com.hospital.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.backend.Models.DoctorModel;
import com.hospital.backend.Repo.DoctorRepo;

@RestController
@CrossOrigin("*")
public class DoctorController 
{
    @Autowired
    private DoctorRepo doctorRepo;

    @GetMapping("/api/doctors/list")
    public List<DoctorModel> getDoctors()
    {
        return doctorRepo.findAll();
    }

    @PostMapping("/api/doctors/add")
    public void addDoctor(@RequestBody DoctorModel doctor)
    {
        doctorRepo.save(doctor);
    }
    
}
