package com.bootcamp.jpa2.entities;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    private int engineCC;

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}