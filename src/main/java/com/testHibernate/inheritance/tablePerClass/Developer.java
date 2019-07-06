package com.testHibernate.inheritance.tablePerClass;

import javax.persistence.Entity;

@Entity(name = "TPC_Developer")
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
