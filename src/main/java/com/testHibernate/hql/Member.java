package com.testHibernate.hql;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table
@Entity(name = "HQL_Member")
@NamedQuery(name = "allMembers", query = "from HQL_Member ")
public class Member {
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

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
