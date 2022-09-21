package com.example.Project.Service;

import com.example.Project.model.entity.FileList;
import com.example.Project.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FileService {
    @Autowired
    private FileRepository fileRepository;

    public FileList save(FileList dto){
        FileList save = fileRepository.save(dto);
        return save;
    }
    public FileList findById(Integer id){
       return fileRepository.findById(id).orElse(null);
    }

    public ArrayList<FileList> findAll(){
        return fileRepository.findAll();
    }

    public void delete(FileList dto){
        fileRepository.delete(dto);
    }

}
