package com.jpa.inheritance.JPAInheritanceDemo.entity.mappesuperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ConsumerData extends ParentClass {

    @Id
    private Long consumerId;

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }
}

