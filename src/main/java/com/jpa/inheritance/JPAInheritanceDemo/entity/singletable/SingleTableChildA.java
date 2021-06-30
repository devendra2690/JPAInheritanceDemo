package com.jpa.inheritance.JPAInheritanceDemo.entity.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class SingleTableChildA extends SingleTableParent{

    @Column
    private Long tranId;

    public Long getTranId() {
        return tranId;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }
}
