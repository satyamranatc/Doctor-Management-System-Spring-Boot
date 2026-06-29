package com.hospital.backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AppointmentModel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;
    private String time;
    private String status;

    private Long patientId;
    private Long doctorId;

    
    public AppointmentModel(String date, String time, String status, Long patientId, Long doctorId) {
        this.date = date;
        this.time = time;
        this.status = status;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
    public AppointmentModel() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getPatientId() {
        return patientId;
    }
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    public Long getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
    
}
