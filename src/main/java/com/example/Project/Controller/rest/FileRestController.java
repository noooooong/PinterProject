package com.example.Project.Controller.rest;

import com.example.Project.Service.FileService;
import com.example.Project.model.entity.FileList;
import com.example.Project.model.request.FileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileRestController {
    @Autowired
    private FileService fileService;

    @PostMapping("rest/file/insert")
    public FileList insert(@RequestBody FileDto dto){
        FileList saved = fileService.save(dto.toEntity());
        return saved;
    }
    @GetMapping("rest/file/selectOne/{id}")
    public FileList selectById(@PathVariable Integer id){
        FileList entity= fileService.findById(id);
        return entity;
    }
    @GetMapping("rest/file/selectAll")
    public ResponseEntity<List<FileList>> selectAll(){
        List<FileList> dtos = fileService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    @PutMapping("rest/file/update")
    public FileList update(@RequestBody FileDto dto){
        FileList saved = fileService.save(dto.toEntity());
        return saved;
    }
//    @DeleteMapping("rest/file/delete/{id}")
//    public void delete(@PathVariable Integer id){
//        System.out.println(id);
//        FileList entity = new FileList(id,null,null,null,null,null);
//        System.out.println(entity);
//        fileService.delete(entity);
//    }

}
