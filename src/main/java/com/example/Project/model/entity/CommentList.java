package com.example.Project.model.entity;

import com.example.Project.Domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor //모든 필드를 매개변수로 가지는 생성자
@NoArgsConstructor //디폴트 생성자 생성
@ToString
@Setter
@Getter

@SequenceGenerator(
        name="COMMENTNUMBER_SEQ_GEN",//시퀀스 제너레이터 이름
        sequenceName="COMMENTNUMBER_SEQ",//시퀀스 이름
        initialValue=1,//시작값
        allocationSize=1//메모리를 통해 할당할 범위 사이즈
)
public class CommentList extends BaseTimeEntity {
    @Id
    //자동으로 증가하는 컬럼
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,//사용할 전략을 시퀀스로  선택
            generator="COMMENTNUMBER_SEQ_GEN"//식별자 생성기를 설정해놓은  USER_SEQ_GEN으로 설정
    )
    private Integer commentId;
    @Column
    private Integer contentNumber;
    @Column
    private Integer userNumber;
    @Column
    private String text;
    @Column
    private Integer recommend;
    @Column
    private Integer coComentClass;
    @Column
    private Integer commentIndex;

}
