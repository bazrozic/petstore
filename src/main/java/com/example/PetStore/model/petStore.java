package com.example.PetStore.model;


import jakarta.persistence.*;

@Entity
@Table(name = "petStore")
public class petStore {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String managerName;

    @OneToOne
    @JoinColumn(name = "address_id")
    private address address;

    public petStore() {}

    public petStore(String name, String managerName, address address) {
        this.name = name;
        this.managerName = managerName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "petStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerName='" + managerName + '\'' +
                ", address=" + address +
                '}';
    }

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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }
}
