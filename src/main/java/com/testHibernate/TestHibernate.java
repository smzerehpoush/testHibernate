package com.testHibernate;


import org.hibernate.Session;

import java.util.Random;

public class TestHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        EmployeeEntity employeeEntity = new EmployeeEntity("mahdiyar","a@b.c");
        session.persist(employeeEntity);
        session.getTransaction().commit();
        session.close();

        HibernateUtil.shutdown();
    }
}
