package com.jpa.inheritance.JPAInheritanceDemo.repository;

import com.jpa.inheritance.JPAInheritanceDemo.entity.joinedtable.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedTableRepository extends JpaRepository<Pet,Long> {
}
