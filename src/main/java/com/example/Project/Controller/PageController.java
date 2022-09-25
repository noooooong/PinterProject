package com.example.Project.Controller;

import com.example.Project.Service.UserService;
import com.example.Project.model.entity.UserList;
import com.example.Project.model.request.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@Slf4j
public class PageController {
    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    public String insertGUI(){
        return "insert";
    }

    @PostMapping("/insert")
    public String insert(UserDto dto, Model model){
        System.out.println(dto);
        UserList entitySaved = userService.save(dto.toEntity());
        System.out.println(entitySaved);
        log.info("log"+entitySaved.toString());
        return "insert";
    }

    @GetMapping("/selectOne/{id}")
    public String selectOne(@PathVariable Integer id, Model model){
        UserList dto = userService.findById(id);
        model.addAttribute("dto",dto);
        System.out.println(dto);
        userService.findAll();
        return "selectOne";
    }

    @GetMapping("/selectAll")
    public String selectAll(Model model){
        ArrayList<UserList> dtos= userService.findAll();

        model.addAttribute("dtos",dtos);
        System.out.println(dtos);
        return "selectAll";
    }

    @GetMapping("/delete/{userNumber}")
    public String delete(@PathVariable Integer userNumber,
                         RedirectAttributes rttr){
        UserList dto = userService.findById(userNumber);
        if(dto!=null){
            userService.delete(dto);
            rttr.addFlashAttribute("msg","success");
        }

        return "redirect:/selectAll";
    }

    @GetMapping("/update/{userNumber}")
    public String update(@PathVariable Integer userNumber,
                         Model model){
        UserList dto = userService.findById(userNumber);
        model.addAttribute("dto",dto);
        return "update";
    }

    @PostMapping("/update")
    public String update(UserDto dto, Model model){
        UserList entity=dto.toEntity();
        System.out.println(entity.toString());
        userService.save(entity);
        return "redirect:/selectOne/"+entity.getUserNumber();
    }
}