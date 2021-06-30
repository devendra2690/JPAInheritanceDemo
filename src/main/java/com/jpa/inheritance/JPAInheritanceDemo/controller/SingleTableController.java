package com.jpa.inheritance.JPAInheritanceDemo.controller;

import com.jpa.inheritance.JPAInheritanceDemo.entity.singletable.SingleTAbleChildB;
import com.jpa.inheritance.JPAInheritanceDemo.entity.singletable.SingleTableChildA;
import com.jpa.inheritance.JPAInheritanceDemo.repository.SingleTableChildARepository;
import com.jpa.inheritance.JPAInheritanceDemo.repository.SingleTableChildBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singletable")
public class SingleTableController {

   @Autowired
   SingleTableChildARepository singleTableChildARepository;

   @Autowired
   SingleTableChildBRepository singleTableChildBRepository;


   @PostMapping("/singleTableChildA")
   public SingleTableChildA  addSingleTableChildA(@RequestBody SingleTableChildA singleTableChildA) {

       singleTableChildARepository.save(singleTableChildA);
       return singleTableChildA;
   }


    @PostMapping("/singleTableChildB")
    public SingleTAbleChildB addSingleTableChildB(@RequestBody SingleTAbleChildB singleTableChildB) {

        singleTableChildBRepository.save(singleTableChildB);
        return singleTableChildB;
    }

}
