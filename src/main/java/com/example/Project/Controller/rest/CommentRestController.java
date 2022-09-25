package com.example.Project.Controller.rest;

import com.example.Project.Service.CommentService;
import com.example.Project.model.entity.CommentList;
import com.example.Project.model.request.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentRestController {
    @Autowired
    private CommentService commentService;

    @PostMapping("rest/comment/insert")
    public CommentList insert(@RequestBody CommentDto dto){
        CommentList saved = commentService.save(dto.toEntity());
        return saved;
    }
    @GetMapping("rest/comment/selectOne/{id}")
    public CommentList selectById(@PathVariable Integer id){
        CommentList entity= commentService.findById(id);
        return entity;
    }
    @GetMapping("rest/comment/selectAll")
    public ResponseEntity<List<CommentList>> selectAll(){
        List<CommentList> dtos = commentService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    @PutMapping("rest/comment/update")
    public CommentList update(@RequestBody CommentDto dto){
        CommentList saved = commentService.save(dto.toEntity());
        return saved;
    }
//    @DeleteMapping("rest/comment/delete/{id}")
//    public void delete(@PathVariable Integer id){
//        System.out.println(id);
//        CommentList entity = new CommentList(id,null,null,null,null,null,null);
//        System.out.println(entity);
//        commentService.delete(entity);
//    }

}
