package com.jpa.inheritance.JPAInheritanceDemo.entity.joinedtable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pet_id")
public class Pet extends Animal{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
