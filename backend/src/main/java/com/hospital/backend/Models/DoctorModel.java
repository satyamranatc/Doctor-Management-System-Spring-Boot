package com.hospital.backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DoctorModel 
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String avatar;
    private String speciality;
    private String edu;
    private int exp;
    private int fee;
    private int successRate;

    public DoctorModel(String name, String avatar, String speciality, String edu, int exp, int fee, int successRate) {
        this.name = name;
        this.avatar = avatar;
        this.speciality = speciality;
        this.edu = edu;
        this.exp = exp;
        this.fee = fee;
        this.successRate = successRate;
    }

    public DoctorModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(int successRate) {
        this.successRate = successRate;
    }
    
 


    
}
