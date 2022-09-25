package com.example.Project.model.request;

//import com.example.Project.model.entity.BoardContents;
import com.example.Project.model.entity.BoardList;
import com.example.Project.model.entity.ContentsList;
import com.example.Project.model.entity.UserList;
import lombok.*;

import javax.persistence.Column;
import java.util.List;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class ContentsDto {


    private Long contentsNumber;
    private UserList userNumber;
    private String contentTitle;
    private String postContent;
    private Integer recommend;
    private Integer clicked;
    private Integer saved;
//    private List<BoardContents> boardContents;

    public ContentsList toEntity(){
        return new ContentsList(contentsNumber,userNumber,contentTitle,postContent,recommend,clicked,saved
//                ,boardContents
        );
    }
}
