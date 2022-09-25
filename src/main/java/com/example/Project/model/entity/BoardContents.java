package com.example.Project.model.entity;

import com.example.Project.Domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class BoardContents extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CONTENT_ID")
    private ContentsList contents;

    @ManyToOne
    @JoinColumn(name = "BOARD_NUMBER")
    private BoardList board;
}
