package com.example.Project.repository;

import com.example.Project.model.entity.CommentList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CommentRepository extends CrudRepository<CommentList,Integer> {
    @Override
    ArrayList<CommentList> findAll();
}
