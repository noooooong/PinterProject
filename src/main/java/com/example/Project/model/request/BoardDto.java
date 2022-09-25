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
public class BoardDto {


    private Long boardNumber;
    private UserList userNumber;
    private ContentsList contentNumber;
    private String modifyUser;
    private String boardName;
    private String boardMemo;
//    private List<BoardContents> boardContents;

    public BoardList toEntity(){
        return new BoardList(boardNumber,userNumber,contentNumber,modifyUser,boardName,boardMemo
//                ,boardContents
        );
    }

}
