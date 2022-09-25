package com.example.Project.model.request;

import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.ContentsList;
import com.example.Project.model.entity.FileList;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class FileDto {


    private Long fileNumber;
    private ContentsList contentNumber;
    private String fileName;
    private String fileSize;
    private Integer fileType;
    private String imageLink;

    public FileList toEntity(){
        return new FileList(fileNumber,contentNumber,fileName,fileSize,fileType,imageLink);
    }
}
