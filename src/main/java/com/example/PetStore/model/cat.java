package com.example.PetStore.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cat")
public class cat extends animal{

    @Column
    private String chipId;

    public cat() {}

    public cat( Date birth, String color, petStore petStore, String chipId) {
        super(birth, color, petStore);
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "cat{" +
                "chipId='" + chipId + '\'' +
                '}';
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }
}
