package sit.int303.demo.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.demo.model.Customer;
import sit.int303.demo.model.Employee;
import sit.int303.demo.model.Office;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-17T13:02:34")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> firstname;
    public static volatile SingularAttribute<Employee, String> extension;
    public static volatile SingularAttribute<Employee, Integer> employeenumber;
    public static volatile SingularAttribute<Employee, String> jobtitle;
    public static volatile CollectionAttribute<Employee, Customer> customerCollection;
    public static volatile CollectionAttribute<Employee, Employee> employeeCollection;
    public static volatile SingularAttribute<Employee, Office> officecode;
    public static volatile SingularAttribute<Employee, Employee> reportsto;
    public static volatile SingularAttribute<Employee, String> email;
    public static volatile SingularAttribute<Employee, String> lastname;

}