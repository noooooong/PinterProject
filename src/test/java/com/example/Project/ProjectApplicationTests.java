package com.example.Project;

import com.example.Project.Service.UserService;
import com.example.Project.model.entity.UserList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {

	}

	@Test
	void myTest(){
		System.out.println("test");
		ArrayList<UserList> dtos = userService.findAll();
		System.out.println(dtos);
	}

	@Test
	void findAll(){
		System.out.println("test");
		ArrayList<UserList> dtos = userService.findAll();
		System.out.println(dtos);
	}


//	@Test
//	@Transactional //실행 후 롤백해줌
//	void insert(){
//
//		UserList entity = new UserList(null,1,"name3","comment");
//		UserList entitySaved = userService.save(entity);
//
//		ArrayList<UserList> dtos = userService.findAll();
//		System.out.println(dtos);
//	}


	@Test
	void select(){
		UserList dto = userService.findById(22);
		System.out.println(dto);
	}


	@Test
	void update(){
		System.out.println("test");
		ArrayList<UserList> dtos = userService.findAll();
		System.out.println(dtos);
	}


	@Test
	void delete(){
		System.out.println("test");
		ArrayList<UserList> dtos = userService.findAll();
		System.out.println(dtos);
	}
}
