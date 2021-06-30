package com.jpa.inheritance.JPAInheritanceDemo.entity.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BMW extends Vehicle{

    @Column
    private String carname;

    @Column
    private String launchYear;

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }
}
