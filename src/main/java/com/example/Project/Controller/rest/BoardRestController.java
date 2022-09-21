package com.example.Project.Controller.rest;

import com.example.Project.Service.BoardService;
import com.example.Project.model.entity.BoardList;
import com.example.Project.model.request.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardRestController {
    @Autowired
    private BoardService boardService;

    @PostMapping("rest/board/insert")
    public BoardList insert(@RequestBody BoardDto dto){
        BoardList saved = boardService.save(dto.toEntity());
        return saved;
    }
    @GetMapping("rest/board/selectOne/{id}")
    public BoardList selectById(@PathVariable Integer id){
        BoardList entity= boardService.findById(id);
        return entity;
    }
    @GetMapping("rest/board/selectAll")
    public ResponseEntity<List<BoardList>> selectAll(){
        List<BoardList> dtos = boardService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }
    @PutMapping("rest/board/update")
    public BoardList update(@RequestBody BoardDto dto){
        BoardList saved = boardService.save(dto.toEntity());
        return saved;
    }
    @DeleteMapping("rest/board/delete/{id}")
    public void delete(@PathVariable Integer id){
        System.out.println(id);
        BoardList entity = new BoardList(id,null,null,null,null,null);
        System.out.println(entity);
        boardService.delete(entity);
    }

}
