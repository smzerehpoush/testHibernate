package com.testHibernate;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity implements Serializable {
    private String id;
    private String name;
    private String email;
    private Set<LessonEntity> lessons= new HashSet<>();

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @ManyToMany(targetEntity = LessonEntity.class)
    @JoinTable(name = "EMPLOYEE_LESSON",joinColumns = {@JoinColumn(name = "LESSON_ID")},inverseJoinColumns = {@JoinColumn(name = "EMPLOYEE_ID")})
    public Set<LessonEntity> getLessons() {
        return lessons;
    }

    public void setLessons(Set<LessonEntity> lessons) {
        this.lessons = lessons;
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Column(name = "EMPLOYEE_ID",unique = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "NAME",unique = true)
    public String getName() {
        return name;
    }

    public void setName(String lastName) {
        this.name = lastName;
    }

    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
