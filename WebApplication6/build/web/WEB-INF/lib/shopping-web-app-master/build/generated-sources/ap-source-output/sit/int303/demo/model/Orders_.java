package sit.int303.demo.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.demo.model.Customer;
import sit.int303.demo.model.OrderDetail;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-17T13:02:34")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, Customer> customernumber;
    public static volatile SingularAttribute<Orders, String> comments;
    public static volatile CollectionAttribute<Orders, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<Orders, Integer> ordernumber;
    public static volatile SingularAttribute<Orders, Date> shippeddate;
    public static volatile SingularAttribute<Orders, Date> orderdate;
    public static volatile SingularAttribute<Orders, Date> requireddate;
    public static volatile SingularAttribute<Orders, String> status;

}