package com.example.DBMS_backend.classpk.service;

import com.example.DBMS_backend.classpk.model.Class;
import com.example.DBMS_backend.classpk.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClassService")
public class ClassServiceImpl implements ClassService {

    private ClassRepository classRepository;

    @Autowired
    public ClassServiceImpl(ClassRepository classRepository){
        this.classRepository = classRepository;
    }

    @Override
    public Iterable<Class> findAll() {
        return classRepository.findAll();
    }
}
