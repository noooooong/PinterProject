package com.example.Project.Service;

import com.example.Project.model.entity.CommentList;
import com.example.Project.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentList save(CommentList dto){
        CommentList save = commentRepository.save(dto);
        return save;
    }
    public CommentList findById(Integer id){
       return commentRepository.findById(id).orElse(null);
    }

    public ArrayList<CommentList> findAll(){
        return commentRepository.findAll();
    }

    public void delete(CommentList dto){
        commentRepository.delete(dto);
    }

}
