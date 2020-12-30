package com.example.DBMS_backend.classpk.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.DBMS_backend.classpk.model.Class;

import javax.persistence.Id;

@Repository("classRepository")
public interface ClassRepository extends CrudRepository<Class, Integer> {
}
