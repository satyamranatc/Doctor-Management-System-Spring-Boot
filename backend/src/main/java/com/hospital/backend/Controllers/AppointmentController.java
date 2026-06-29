package com.hospital.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.backend.Models.AppointmentModel;
import com.hospital.backend.Repo.AppointmentRepo;

@RestController
@CrossOrigin("*")
public class AppointmentController 
{
    @Autowired
    private AppointmentRepo AppointmentRepo;

    @GetMapping("/api/appointments/list")
    public List<AppointmentModel> getAppointments()
    {
        return AppointmentRepo.findAll();
    }

    @PostMapping("/api/appointments/add")
    public void addAppointment(@RequestBody AppointmentModel Appointment)
    {
        AppointmentRepo.save(Appointment);
    }
    
}
