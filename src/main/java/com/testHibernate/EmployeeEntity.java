package com.testHibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee",schema = "hibnet",uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "email")
})
public class EmployeeEntity implements Serializable {
    private static final String tableName="employee";
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Column(name = "id",unique = true,table = tableName)
    private String id;
    @Column(name = "first_name",length = 100,table = tableName)
    private String firstName;
    @Column(name = "last_Name",length = 100,table = tableName)
    private String lastName;
    @Column(name = "email",unique = true,table = tableName)
    private String email;
    @Column(name = "date",table = tableName)
    private Date date = new Date();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
