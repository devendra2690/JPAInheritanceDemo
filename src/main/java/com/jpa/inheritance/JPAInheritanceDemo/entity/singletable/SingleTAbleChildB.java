package com.jpa.inheritance.JPAInheritanceDemo.entity.singletable;

import javax.persistence.*;

@Entity
@DiscriminatorValue("B")
public class SingleTAbleChildB extends SingleTableParent{

    @Column
    private Long planid;

    public Long getPlanid() {
        return planid;
    }

    public void setPlanid(Long planid) {
        this.planid = planid;
    }
}
