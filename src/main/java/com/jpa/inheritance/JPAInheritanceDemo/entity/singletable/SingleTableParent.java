package com.jpa.inheritance.JPAInheritanceDemo.entity.singletable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "table_type",discriminatorType = DiscriminatorType.STRING)
// CAN USE THIS AS WELL  @DiscriminatorFormula("case when author is not null then 1 else 2 end")
public class SingleTableParent {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String fullname;

    @Column
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
