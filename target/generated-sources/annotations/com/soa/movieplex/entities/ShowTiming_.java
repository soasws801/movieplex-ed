package com.soa.movieplex.entities;

import com.soa.movieplex.entities.Movie;
import com.soa.movieplex.entities.Theater;
import com.soa.movieplex.entities.Timeslot;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T18:11:13")
@StaticMetamodel(ShowTiming.class)
public class ShowTiming_ { 

    public static volatile SingularAttribute<ShowTiming, Integer> id;
    public static volatile SingularAttribute<ShowTiming, Movie> movie;
    public static volatile SingularAttribute<ShowTiming, Theater> theater;
    public static volatile SingularAttribute<ShowTiming, Integer> day;
    public static volatile SingularAttribute<ShowTiming, Timeslot> timeslot;

}