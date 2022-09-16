package com.example.Project.Service;

import com.example.Project.model.entity.TestEntity;
import com.example.Project.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public TestEntity save(TestEntity dto){
        TestEntity save = testRepository.save(dto);
        return save;
    }
    public TestEntity findById(Integer id){
       return testRepository.findById(id).orElse(null);
    }

    public ArrayList<TestEntity> findAll(){
        return testRepository.findAll();
    }

    public void delete(TestEntity dto){
        testRepository.delete(dto);
    }
}
