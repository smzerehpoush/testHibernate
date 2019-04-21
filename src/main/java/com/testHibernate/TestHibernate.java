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
        System.out.println("11111111"+emp.getId());
        session.save(emp);
        System.out.println("22222222-1244"+emp.getId());
        session.getTransaction().commit();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        emp.setEmail("mahdiyar"+System.currentTimeMillis() +"@gmail.com");
        session.saveOrUpdate(emp);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
