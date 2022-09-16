package com.example.Project.repository;

import com.example.Project.model.entity.UserList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<UserList,Integer> {
    @Override
    ArrayList<UserList> findAll();

    //ArrayList<CommentEntity> byLoginEntityId(Integer id);
}
