package com.example.Project.model.request;

import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.ContentsList;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class ContentsDto {


    private Integer contentsNumber;
    private Integer userNumber;
    private String contentTitle;
    private String postContent;
    private Integer recommend;
    private Integer clicked;
    private Integer saved;

    public ContentsList toEntity(){
        return new ContentsList(contentsNumber,userNumber,contentTitle,postContent,recommend,clicked,saved);
    }
}
