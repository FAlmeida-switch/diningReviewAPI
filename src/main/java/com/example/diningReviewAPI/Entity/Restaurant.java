package com.example.diningReviewAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RESTAURANT")
public class Restaurant {
    
    @Id
    @GeneratedValue
    private Long _id;

    @Column(name="NAME", nullable = false)
    private String _name;

    @Column(name="AVG_PEANUT")
    private Float _avgPeanut;

    @Column(name="AVG_EGG")
    private Float _avgEgg;

    @Column(name="AVG_DAIRY")
    private Float _avgDairy;

    @Column(name="AVG_SCORE")
    private Float _avgScore;


public Restaurant() {

}

// GETTERS
public Long getId() {
    return this._id;
}

public String getName() {
    return this._name;
}

public Float getAvgPeanut() {
    return this._avgPeanut;
}

public Float getAvgEgg() {
    return this._avgEgg;
}

public Float getAvgDairy() {
    return this._avgDairy;
}

public Float getAvgScore() {
    return this._avgScore;
}

//SETTERS

protected void setId(Long newId) {
    this._id = newId;
}

public void setName(String newName) {
    this._name = newName;
}

public void setAvgPeanut(Float newPeanut) {
    this._avgPeanut = newPeanut;
}

public void setAvgEgg(Float newEgg) {
    this._avgEgg = newEgg;
}

public void setAvgDairy(Float newDairy) {
    this._avgDairy = newDairy;
}
}