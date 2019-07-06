package com.testHibernate.relation.manyToMany;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Member member = new Member();
        member.setName("ali");
        Degree degree = new Degree();
        degree.setName("senior");
        member.getDegrees().add(degree);
        session.save(member);
        session.save(degree);
        session.getTransaction().commit();
        session.close();
    }
}
