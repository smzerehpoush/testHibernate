package com.testHibernate;

public class Main {
    public static void main(String[] args) {
        com.testHibernate.relation.oneToOne.Main.main(args);
        com.testHibernate.relation.oneToMany.Main.main(args);
        com.testHibernate.relation.manyToOne.Main.main(args);
        com.testHibernate.relation.manyToMany.Main.main(args);
        com.testHibernate.relation.embedded.Main.main(args);
    }
}
