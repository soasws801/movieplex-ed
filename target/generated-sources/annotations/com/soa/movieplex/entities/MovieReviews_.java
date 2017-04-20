package com.soa.movieplex.entities;

import com.soa.movieplex.entities.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T20:12:35")
@StaticMetamodel(MovieReviews.class)
public class MovieReviews_ { 

    public static volatile SingularAttribute<MovieReviews, Integer> id;
    public static volatile SingularAttribute<MovieReviews, Movie> movie;
    public static volatile SingularAttribute<MovieReviews, String> rating;
    public static volatile SingularAttribute<MovieReviews, String> customer;
    public static volatile SingularAttribute<MovieReviews, String> comments;

}