package com.example.carbonfootprint.models;

import jakarta.persistence.*;

@Entity
@Table(name = "compensating_activity")
public class CompensatingActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double co2_compensation_per_unit; // CO2 compensated per unit of activity

    // Constructors, getters, and setters


    public CompensatingActivity() {
    }

    public CompensatingActivity(Long id, String name, Double co2_compensation_per_unit) {
        this.id = id;
        this.name = name;
        this.co2_compensation_per_unit = co2_compensation_per_unit;
    }

    public CompensatingActivity(String name, Double co2_compensation_per_unit) {
        this.name = name;
        this.co2_compensation_per_unit = co2_compensation_per_unit;
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

    public Double co2_compensation_per_unit() {
        return co2_compensation_per_unit;
    }

    public void setCo2_compensation_per_unit(Double co2_compensation_per_unit) {
        this.co2_compensation_per_unit = co2_compensation_per_unit;
    }

    public Double getCo2_compensation_per_unit() {
        return co2_compensation_per_unit;
    }

    @Override
    public String toString() {
        return "CompensatingActivity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", co2_compensation_per_unit=" + co2_compensation_per_unit +
                '}';
    }
}

