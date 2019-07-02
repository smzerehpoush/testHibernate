package com.testHibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.configure("META-INF/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }
    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
    public static void shutdown(){
        sessionFactory.close();
    }
}
