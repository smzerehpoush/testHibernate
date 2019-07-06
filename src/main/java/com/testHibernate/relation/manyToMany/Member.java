package com.testHibernate.relation.manyToMany;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "MTM_Memeber")
@Table
public class Member {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    @ManyToMany
    private Set<Degree> degrees = new HashSet<>();

    public Set<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(Set<Degree> degrees) {
        this.degrees = degrees;
    }

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
