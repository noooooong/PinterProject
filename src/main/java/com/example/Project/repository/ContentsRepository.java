package com.example.Project.repository;

import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.ContentsList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ContentsRepository extends CrudRepository<ContentsList,Integer> {
    @Override
    ArrayList<ContentsList> findAll();
}
