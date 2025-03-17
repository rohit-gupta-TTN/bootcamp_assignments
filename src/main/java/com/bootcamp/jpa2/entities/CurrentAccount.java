package com.bootcamp.jpa2.entities;

import jakarta.persistence.Entity;

@Entity
public class CurrentAccount extends BankAccount {

    private double limitt;

    public double getLimitt() {
        return limitt;
    }

    public void setLimitt(double limitt) {
        this.limitt = limitt;
    }
}