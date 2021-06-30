package com.jpa.inheritance.JPAInheritanceDemo.entity.tableperclass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String companyname;

    @Column
    private String establisedYear;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getEstablisedYear() {
        return establisedYear;
    }

    public void setEstablisedYear(String establisedYear) {
        this.establisedYear = establisedYear;
    }
}
