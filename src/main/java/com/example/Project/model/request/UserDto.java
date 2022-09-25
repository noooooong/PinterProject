package com.example.Project.model.request;

import com.example.Project.model.entity.UserList;
import com.example.Project.model.entity.UserState;
import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter
public class UserDto {
    private Long userNumber;
    private String email;
    private String userPw;
    private String lastName;
    private String firstName;
    private String introduction;
    private String profilePic;
    private UserState stateCheck;
    public UserList toEntity(){
        return new UserList(userNumber,email,userPw,lastName,firstName,introduction,profilePic,stateCheck);
    }
}
