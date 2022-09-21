package com.example.Project.model.request;

import com.example.Project.model.entity.BoardList;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class BoardDto {


    private Integer boardNumber;
    private Integer userNumber;
    private Integer contentNumber;
    private String modifyUser;
    private String boardName;
    private String boardMemo;

    public BoardList toEntity(){
        return new BoardList(boardNumber,userNumber,contentNumber,modifyUser,boardName,boardMemo);
    }
}
