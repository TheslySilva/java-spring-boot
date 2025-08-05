package com.thesly.projeto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;
    private String marca;
    private Integer quantity;
    private Integer valor;

    public Products() {}

    public Products(
            int id,
            String name,
            String marca,
            Integer quantity,
            Integer valor
    ) {
        Id = id;
        this.name = name;
        this.marca = marca;
        this.quantity = quantity;
        this.valor = valor;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", quantity=" + quantity +
                ", valor=" + valor +
                '}';
    }
}
