package com.testHibernate.inheritance.singleTable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Single_Developer")
public class Developer extends User {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Developer() {
    }

    public Developer(String name, int salary) {
        super(name);
        this.salary = salary;
    }
}
