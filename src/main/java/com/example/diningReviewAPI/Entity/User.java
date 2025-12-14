package com.example.diningReviewAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="USER")
public class User {
    
    @Id
    @GeneratedValue
    private Long _id;

    @Column(name="DISPLAYNAME", unique = true, nullable = false)
    private String _displayName;

    @Column(name="CITY")
    private String _city;

    @Column(name="STATE")
    private String _state;

    @Column(name="ZIPCODE")
    private String _zipCode;

    @Column(name="INTERESTALLERGIESPEANUT")
    private Boolean _isInterestedAllergiesPeanut;

    @Column(name="INTERESTALLERGIESEGG")
    private Boolean _isInterestedAllergiesEgg;

    @Column(name="INTERESTALLERGIESDAIRY")
    private Boolean _isInterestedAllergiesDairy;


    public User() {

    }

    // GETTERS
    public Long getId() {
        return this._id;
    }

    public String getDisplayName() {
        return this._displayName;
    }

    public String getCity() {
        return this._city;
    }

    public String getState() {
        return this._state;
    }

    public String getZipCode() {
        return this._zipCode;
    }

    public Boolean getIsInterestedAllergiesPeanut() {
        return this._isInterestedAllergiesPeanut;
    }

    public Boolean getIsInterestedAllergiesEgg() {
        return this._isInterestedAllergiesEgg;
    }

    public Boolean getIsInterestedAllergiesDairy() {
        return this._isInterestedAllergiesDairy;
    }

    // SETTERS
    protected void setId(Long newId) {
        this._id = newId;
    }

    public void setDisplayName(String newDisplayName) {
        this._displayName = newDisplayName;
    }

    public void setCity(String newCity) {
        this._city = newCity;
    }

    public void setState(String newState) {
        this._state = newState;
    }

    public void setZipCode(String newZipCode) {
        this._zipCode = newZipCode;
    }

    public void setIsInterestedAllergiesPeanut(Boolean interested) {
        this._isInterestedAllergiesPeanut = interested;
    }

    public void setIsInterestedAllergiesEgg(Boolean interested) {
        this._isInterestedAllergiesEgg = interested;
    }

    public void setIsInterestedAllergiesDairy(Boolean interested) {
        this._isInterestedAllergiesDairy = interested;
    }
}