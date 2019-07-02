package com.testHibernate.manyToOne;

import com.testHibernate.oneToOne.Address;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table
@Entity(name = "MTO_MemberType")
public class MemberType {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
