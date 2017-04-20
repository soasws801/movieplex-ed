/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soa.movieplex.reviewing;

import com.soa.movieplex.client.MovieReviewBackingBean;
import com.soa.movieplex.entities.Movie;
import com.soa.movieplex.entities.MovieReviews;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author Eric Desrochers
 */
@Named
@FlowScoped("reviewing")

public class Reviewing implements Serializable {

    int movieId;
    @PersistenceContext
    EntityManager entityManager;
    
    @Inject
    MovieReviewBackingBean bean;
    
    @Resource
    private UserTransaction userTransaction;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void addReview() throws Exception {
        userTransaction.begin();
        MovieReviews review = new MovieReviews(bean.getReviewId(),
                bean.getCustomer(), bean.getRating(), bean.getComments());
        Movie movie = new Movie(movieId);
        review.setMovie(movie);

        entityManager.persist(review);
        userTransaction.commit();
    }

    public String getReviews() {
        try {

            List<MovieReviews> list = entityManager.createNamedQuery(
                    "MovieReviews.findById",
                    MovieReviews.class).setParameter("movieId", movieId).setParameter("movieId",
                    movieId).getResultList();
            if (list.isEmpty()) {
                return "none";
            }
            return list.get(0).getMovie().getId().toString();
        } catch (NoResultException e) {
            return "none";

        }
    }

    public String getMovieName() {
        try {

            return entityManager.createNamedQuery("Movie.findById",
                    Movie.class).setParameter("id", movieId).getSingleResult().getName();
        } catch (NoResultException e) {
            return "";
        }
    }

}
