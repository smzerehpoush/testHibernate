package com.testHibernate.relation.oneToMany;

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
        memberType.setMember(member);
        session.save(member);
        session.save(memberType);
        session.getTransaction().commit();
        session.close();
    }
}
