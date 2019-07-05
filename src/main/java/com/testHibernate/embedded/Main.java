package com.testHibernate.embedded;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Member member = new Member();
        member.setName("ali");
        Address address = new Address();
        address.setCity("tehran");
        address.setStreet("vali-asr");
        member.setAddress(address);
        session.save(member);
        session.getTransaction().commit();
        session.close();

    }
}
