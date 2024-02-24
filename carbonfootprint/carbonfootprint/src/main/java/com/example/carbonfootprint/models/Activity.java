package com.example.carbonfootprint.models;


import jakarta.persistence.*;


@Entity
@Table
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double co2_per_unit; // CO2 emissions per unit of activity

    // Constructors, getters, and setters


    public Activity() {
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

    public Double get_co2_per_unit() {
        return co2_per_unit;
    }

    public void set_co2_per_unit(Double co2PerUnit) {
        this.co2_per_unit = co2_per_unit;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", co2_per_unit=" + co2_per_unit +
                '}';
    }
}

