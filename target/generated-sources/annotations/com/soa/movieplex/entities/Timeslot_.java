package com.soa.movieplex.entities;

import com.soa.movieplex.entities.ShowTiming;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-22T18:11:13")
@StaticMetamodel(Timeslot.class)
public class Timeslot_ { 

    public static volatile SingularAttribute<Timeslot, Integer> id;
    public static volatile SingularAttribute<Timeslot, String> startTime;
    public static volatile CollectionAttribute<Timeslot, ShowTiming> showTimings;
    public static volatile SingularAttribute<Timeslot, String> endTime;

}