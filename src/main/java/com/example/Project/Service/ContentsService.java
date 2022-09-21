package com.example.Project.Service;

import com.example.Project.model.entity.ContentsList;
import com.example.Project.repository.ContentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ContentsService {
    @Autowired
    private ContentsRepository contentsRepository;

    public ContentsList save(ContentsList dto){
        ContentsList save = contentsRepository.save(dto);
        return save;
    }
    public ContentsList findById(Integer id){
       return contentsRepository.findById(id).orElse(null);
    }

    public ArrayList<ContentsList> findAll(){
        return contentsRepository.findAll();
    }

    public void delete(ContentsList dto){
        contentsRepository.delete(dto);
    }

}
