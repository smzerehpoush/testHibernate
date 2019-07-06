package com.testHibernate.hql;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Member member = new Member();
        member.setName("ali");
        session.save(member);
        session.getTransaction().commit();
        List<Member> members = session.createNamedQuery("allMembers").getResultList();
//        List<Member> members = session.createQuery("from HQL_Member m WHERE m.name like :name ")
//                .setParameter("name", "ali").getResultList();

        members.forEach(System.out::println);
        session.close();
    }
}
