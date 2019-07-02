package com.testHibernate.oneToOne;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Member m = new Member();
        m.setName("ali");
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
//        Address address = new Address();
//        address.setCity();
    }
}
