package com.example.Project.model.request;

import com.example.Project.model.entity.TestEntity;

public class TestDto {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public TestEntity toEntity(){
        return new TestEntity(id,name,password);
    }

    public TestDto(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
