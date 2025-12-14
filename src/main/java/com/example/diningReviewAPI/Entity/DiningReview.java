package com.example.diningReviewAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DINING_REVIEW")
public class DiningReview {

    @Id
    @GeneratedValue
    private Long _id;

    @ManyToOne
    @JoinColumn(name="RESTAURANT_ID", nullable = false)
    private Restaurant _restaurant;

    @ManyToOne
    @JoinColumn(name="USER_ID", nullable = false)
    private User _submittedBy;

    @Column(name="PEANUT")
    private Integer _peanut;
    @Column(name="EGG")
    private Integer _egg;
    @Column(name="DAIRY")
    private Integer _dairy;
    @Column(name="COMMENTARY")
    private String _commentary;

    public DiningReview() {

    }

    // GETTERS
    public Long getId() { return this._id; }

    public Restaurant getRestaurant() { return this._restaurant; }

    public User getSubmittedBy() { return this._submittedBy; }

    public Integer getPeanut() { return this._peanut; }

    public Integer getEgg() { return this._egg; }

    public Integer getDairy() { return this._dairy; }

    public String getCommentary() { return this._commentary; }

    // SETTERS 
    protected void setId(Long newId) { this._id = newId; }

    private void setRestaurant(Restaurant newRestaurant) { this._restaurant = newRestaurant; }

    public void setSubmittedBy(User newSubmittedBy) { this._submittedBy = newSubmittedBy; }

    public void setPeanut(Integer newPeanut) { this._peanut = newPeanut; }

    public void setEgg(Integer newEgg) { this._egg = newEgg; }

    public void setDairy(Integer newDairy) { this._dairy = newDairy; }

    public void setCommentary(String newCommentaryString) {
        this._commentary = newCommentaryString;
    }
}
