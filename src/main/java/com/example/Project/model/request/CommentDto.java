package com.example.Project.model.request;

import com.example.Project.model.entity.CommentList;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class CommentDto {
    private Integer commentId;
    private Integer contentNumber;
    private Integer userNumber;
    private String text;
    private Integer recommend;
    private Integer coComentClass;
    private Integer commentIndex;

    public CommentList toEntity(){
        return new CommentList(commentId,contentNumber,userNumber,text,recommend,coComentClass,commentIndex);
    }
}
