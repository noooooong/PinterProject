package com.example.Project.model.request;

import com.example.Project.model.entity.CommentList;
import com.example.Project.model.entity.CommentState;
import com.example.Project.model.entity.ContentsList;
import com.example.Project.model.entity.UserList;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class CommentDto {
    private Long commentId;
    private ContentsList contentNumber;
    private UserList userNumber;
    private String text;
    private Integer recommend;
    private CommentState coComentClass;
    private Integer commentIndex;

    public CommentList toEntity(){
        return new CommentList(commentId,contentNumber,userNumber,text,recommend,coComentClass,commentIndex);
    }
}
