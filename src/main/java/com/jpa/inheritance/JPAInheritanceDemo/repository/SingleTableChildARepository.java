package com.jpa.inheritance.JPAInheritanceDemo.repository;

import com.jpa.inheritance.JPAInheritanceDemo.entity.singletable.SingleTableChildA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTableChildARepository extends JpaRepository<SingleTableChildA,Long> {
}
