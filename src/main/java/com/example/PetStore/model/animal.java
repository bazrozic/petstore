package com.example.PetStore.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "animal")
@Inheritance(strategy = InheritanceType.JOINED)
public class animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date birth;

    @Column
    private String color;

    @ManyToOne
    @JoinColumn(name = "petStore_id")
    private petStore petStore;

    public animal() {}

    public animal(Date birth, String color, petStore petStore) {
        this.birth = birth;
        this.color = color;
        this.petStore = petStore;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", birth=" + birth +
                ", color='" + color + '\'' +
                ", petStore=" + petStore.getName() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public petStore getPetStore() {
        return petStore;
    }

    public void setPetStore(petStore petStore) {
        this.petStore = petStore;
    }

}