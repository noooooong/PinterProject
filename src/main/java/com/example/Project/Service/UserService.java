package com.example.Project.Service;

import com.example.Project.model.entity.UserList;
import com.example.Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserList save(UserList dto){
        UserList save = userRepository.save(dto);
        return save;
    }
    public UserList findById(Integer id){
       return userRepository.findById(id).orElse(null);
    }

    public ArrayList<UserList> findAll(){
        return userRepository.findAll();
    }

    public void delete(UserList dto){
        userRepository.delete(dto);
    }

}
