package entities;

import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2020-09-23T13:39:18")
@StaticMetamodel(SwimStyle.class)
public class SwimStyle_ { 

    public static volatile SingularAttribute<SwimStyle, Long> S_id;
    public static volatile ListAttribute<SwimStyle, Person> persons;
    public static volatile SingularAttribute<SwimStyle, String> styleName;

}