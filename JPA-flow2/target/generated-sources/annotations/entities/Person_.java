package entities;

import entities.Adress;
import entities.Fee;
import entities.SwimStyle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-09-23T13:39:18")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile ListAttribute<Person, Fee> fees;
    public static volatile SingularAttribute<Person, Integer> year;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, Adress> adress;
    public static volatile ListAttribute<Person, SwimStyle> styles;
    public static volatile SingularAttribute<Person, Long> p_id;

}