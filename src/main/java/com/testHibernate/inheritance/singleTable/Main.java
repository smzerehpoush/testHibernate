package com.testHibernate.inheritance.singleTable;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        User user = new User("ali");
        Developer developer = new Developer("mammad", 10);
        session.save(user);
        session.save(developer);
        session.getTransaction().commit();
        session.close();
    }
}
