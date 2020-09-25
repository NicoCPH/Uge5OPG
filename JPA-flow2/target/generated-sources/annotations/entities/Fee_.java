package entities;

import entities.Person;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-09-23T13:39:18")
@StaticMetamodel(Fee.class)
public class Fee_ { 

    public static volatile SingularAttribute<Fee, Integer> amount;
    public static volatile SingularAttribute<Fee, Person> person;
    public static volatile SingularAttribute<Fee, Long> f_id;
    public static volatile SingularAttribute<Fee, Date> payDate;

}