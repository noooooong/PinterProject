package com.example.Project.Service;

import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.UserList;
import com.example.Project.repository.BoardRepository;
import com.example.Project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public BoardList save(BoardList dto){
        BoardList save = boardRepository.save(dto);
        return save;
    }
    public BoardList findById(Integer id){
       return boardRepository.findById(id).orElse(null);
    }

    public ArrayList<BoardList> findAll(){
        return boardRepository.findAll();
    }

    public void delete(BoardList dto){
        boardRepository.delete(dto);
    }

}
