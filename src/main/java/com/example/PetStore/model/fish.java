package com.example.PetStore.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fish")
public class fish extends animal{

    @Enumerated(EnumType.STRING)
    @Column(name = "livingEnv")
    private FishLivEnv livingEnv;

    public fish() {
        super();
    }

    public fish(Date birth, String color, petStore petStore, FishLivEnv livingEnv) {
        super(birth, color, petStore);
        this.livingEnv = livingEnv;
    }

    public FishLivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(FishLivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }

    @Override
    public String toString() {
        return "fish{" +
                "id=" + getId() +
                ", birth=" + getBirth() +
                ", color='" + getColor() + '\'' +
                ", petStore=" + getPetStore() +
                ", livingEnv=" + livingEnv +
                '}';
    }

}
