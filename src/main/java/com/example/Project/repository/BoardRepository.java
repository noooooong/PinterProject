package com.example.Project.repository;

import com.example.Project.model.entity.BoardList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BoardRepository extends CrudRepository<BoardList,Integer> {
    @Override
    ArrayList<BoardList> findAll();
}
