package com.hospital.backend.Models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientModel 
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String avatar;
    private String gender;
    private int age;
    private String symptoms;
    private String desc;


    public PatientModel(String name, String avatar, String gender, int age, String symptoms, String desc) {
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.age = age;
        this.symptoms = symptoms;
        this.desc = desc;
    }
    public PatientModel() {}

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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
   
    
}
