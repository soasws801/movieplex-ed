/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eric Desrochers
 */
@Entity
@Table(name = "MOVIE_REVIEWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MovieReviews.findAll", query = "SELECT m FROM MovieReviews m")
    , @NamedQuery(name = "MovieReviews.findById", query = "SELECT m FROM MovieReviews m WHERE m.id = :id")})
public class MovieReviews implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String customer;
    private String rating;
    private String comments;
    private Movie movie;

    public MovieReviews(int reviewId, String customer, String rating, String comments) {
            id = reviewId;
            this.customer = customer;
            this.rating = rating;
            this.comments = comments;
            
            
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    @Override
    public String toString() {
        return "com.soa.movieplex.entities.MovieReviews[ id=" + id + " ]";
    }
    
}
