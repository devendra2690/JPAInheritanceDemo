package com.jpa.inheritance.JPAInheritanceDemo.controller;

import com.jpa.inheritance.JPAInheritanceDemo.entity.joinedtable.Pet;
import com.jpa.inheritance.JPAInheritanceDemo.repository.JoinedTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jointable")
public class JoinedTableInheritaceController {


    @Autowired
    JoinedTableRepository joinedTableRepository;

    @PostMapping("/add")
    public Pet add(@RequestBody Pet pet) {
        return joinedTableRepository.save(pet);
    }
}
