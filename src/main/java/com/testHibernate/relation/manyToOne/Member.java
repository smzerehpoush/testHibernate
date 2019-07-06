package com.testHibernate.relation.manyToOne;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "MTO_Memeber")
@Table
public class Member {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<MemberType> memberType = new HashSet<>();

    public Set<MemberType> getMemberType() {
        return memberType;
    }

    public void setMemberType(Set<MemberType> memberType) {
        this.memberType = memberType;
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
