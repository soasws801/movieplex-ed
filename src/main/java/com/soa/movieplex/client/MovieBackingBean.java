/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.client;

import java.io.Serializable;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Eric Desrochers
 */
@Named
@SessionScoped
public class MovieBackingBean implements  Serializable {

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    int movieId;
}
