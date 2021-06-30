package com.jpa.inheritance.JPAInheritanceDemo.controller;

import com.jpa.inheritance.JPAInheritanceDemo.entity.tableperclass.BMW;
import com.jpa.inheritance.JPAInheritanceDemo.repository.TablePerClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class TablePerClassController {

    @Autowired
    private TablePerClassRepository  tablePerClassRepository;

    @PostMapping("/add")
    public BMW add(@RequestBody BMW bmw) {
        return tablePerClassRepository.save(bmw);
    }

}
