package com.example.Project.Controller.rest;

import com.example.Project.Service.UserService;
import com.example.Project.model.entity.UserList;
import com.example.Project.model.request.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;
    @GetMapping("/rest/test")
    public String test(){
        return "RestTest";
    }

    @PostMapping("rest/user/insert")
    public UserList insert(@RequestBody UserDto dto){
        UserList saved = userService.save(dto.toEntity());
        return saved;
    }
    @GetMapping("rest/user/selectOne/{id}")
    public UserList selectById(@PathVariable Integer id){
        UserList entity= userService.findById(id);
        return entity;
    }
    @GetMapping("rest/user/selectAll")
    public ResponseEntity<List<UserList>> selectAll(){
        List<UserList> dtos = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    @PutMapping("rest/user/update")
    public UserList update(@RequestBody UserDto dto){
        UserList saved = userService.save(dto.toEntity());
        return saved;
    }
//    @DeleteMapping("rest/user/delete/{id}")
//    public void delete(@PathVariable Integer id){
//        System.out.println(id);
//        UserList entity = new UserList(id,null,null,null,null,null,null,null);
//        System.out.println(entity);
//        userService.delete(entity);
//    }

}
