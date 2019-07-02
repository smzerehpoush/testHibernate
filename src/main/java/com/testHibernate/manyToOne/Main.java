package com.testHibernate.manyToOne;

import com.testHibernate.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        Member member = new Member();
        member.setName("ali");
        MemberType memberType = new MemberType();
        memberType.setName("VIP");
        member.getMemberType().add(memberType);
        session.save(member);
        session.getTransaction().commit();
        session.close();
    }
}
