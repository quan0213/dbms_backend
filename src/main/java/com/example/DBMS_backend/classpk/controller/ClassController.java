package com.example.DBMS_backend.classpk.controller;

import com.example.DBMS_backend.classpk.model.Class;
import com.example.DBMS_backend.classpk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/class")
public class ClassController {

    private ClassService classService;

    @Autowired
    public ClassController(ClassService classService){
        this.classService = classService;
    }
    @RequestMapping("getall")
    @GetMapping
    public Iterable<Class> getAllClass(){
        return classService.findAll();
    }
}
