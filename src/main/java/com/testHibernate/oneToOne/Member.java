package com.testHibernate.oneToOne;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table
@Entity(name = "OTO_Member")
public class Member {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id ;
  private String name;
  @JoinColumn(name = "fkAddressId")
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
