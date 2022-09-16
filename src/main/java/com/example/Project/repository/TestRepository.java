package com.example.Project.repository;

import com.example.Project.model.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TestRepository extends CrudRepository<TestEntity,Integer> {
    @Override
    ArrayList<TestEntity> findAll();
}
