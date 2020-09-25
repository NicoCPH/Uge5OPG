package entities;

import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-09-23T13:39:18")
@StaticMetamodel(Adress.class)
public class Adress_ { 

    public static volatile SingularAttribute<Adress, Integer> zip;
    public static volatile SingularAttribute<Adress, Long> a_id;
    public static volatile SingularAttribute<Adress, String> city;
    public static volatile SingularAttribute<Adress, String> street;
    public static volatile SingularAttribute<Adress, Person> person;

}