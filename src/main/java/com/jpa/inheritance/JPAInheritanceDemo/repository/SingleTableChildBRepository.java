package com.jpa.inheritance.JPAInheritanceDemo.repository;

import com.jpa.inheritance.JPAInheritanceDemo.entity.singletable.SingleTAbleChildB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTableChildBRepository extends JpaRepository<SingleTAbleChildB, Long> {
}
