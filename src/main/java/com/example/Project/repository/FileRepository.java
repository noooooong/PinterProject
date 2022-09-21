package com.example.Project.repository;

import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.FileList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface FileRepository extends CrudRepository<FileList,Integer> {
    @Override
    ArrayList<FileList> findAll();
}
