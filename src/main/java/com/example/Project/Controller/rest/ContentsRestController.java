package com.example.Project.Controller.rest;

import com.example.Project.Service.ContentsService;
import com.example.Project.model.entity.ContentsList;
import com.example.Project.model.request.ContentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContentsRestController {
    @Autowired
    private ContentsService contentsService;

    @PostMapping("rest/contents/insert")
    public ContentsList insert(@RequestBody ContentsDto dto){
        ContentsList saved = contentsService.save(dto.toEntity());
        return saved;
    }
    @GetMapping("rest/contents/selectOne/{id}")
    public ContentsList selectById(@PathVariable Integer id){
        ContentsList entity= contentsService.findById(id);
        return entity;
    }
    @GetMapping("rest/contents/selectAll")
    public ResponseEntity<List<ContentsList>> selectAll(){
        List<ContentsList> dtos = contentsService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    @PutMapping("rest/contents/update")
    public ContentsList update(@RequestBody ContentsDto dto){
        ContentsList saved = contentsService.save(dto.toEntity());
        return saved;
    }
    @DeleteMapping("rest/contents/delete/{id}")
    public void delete(@PathVariable Integer id){
        System.out.println(id);
        ContentsList entity = new ContentsList(id,null,null,null,null,null,null);
        System.out.println(entity);
        contentsService.delete(entity);
    }

}
