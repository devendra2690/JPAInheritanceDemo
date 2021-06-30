package com.jpa.inheritance.JPAInheritanceDemo.repository;

import com.jpa.inheritance.JPAInheritanceDemo.entity.tableperclass.BMW;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TablePerClassRepository extends JpaRepository<BMW,Long> {
}
