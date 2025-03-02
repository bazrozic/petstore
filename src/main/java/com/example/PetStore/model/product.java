package com.example.PetStore.model;

import jakarta.persistence.*;


@Entity
@Table(name = "product")
public class product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "code")
        private String code;

        @Column(name = "label")
        private String label;

        @Enumerated(EnumType.STRING)
        @Column(name = "type")
        private ProdType type;

        @Column(name = "price")
        private Double price;

        public product() {
        }

        public product(String code,String label, ProdType type, Double price, petStore petStore) {
            this.code = code;
            this.label = label;
            this.type = type;
            this.price = price;
        }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
