package com.testHibernate;

import org.hibernate.Session;

public class TestHibernate {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user"+ System.currentTimeMillis() +"@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");
        session.save(emp);
        session.getTransaction().commit();
        session = HibernateUtil.getSession();
        session.getTransaction().begin();
        emp.setEmail("mahdiyar"+System.currentTimeMillis() +"@gmail.com");
        session.saveOrUpdate(emp);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }

}
