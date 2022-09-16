package com.example.Project.Controller;

import com.example.Project.Service.TestService;
import com.example.Project.model.entity.TestEntity;
import com.example.Project.model.request.TestDto;
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
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/insert")
    public String insertGUI(){
        return "insert";
    }

    @PostMapping("/insert")
    public String insert(TestDto dto, Model model){
        System.out.println(dto);
//        LoginEntity entity=new LoginEntity(null,dto.getName(),dto.getPassword());
//        LoginEntity entitySaved = loginRepository.save(entity);
        TestEntity entitySaved = testService.save(dto.toEntity());
        System.out.println(entitySaved);
        log.info("log"+entitySaved.toString());
//        return "redirect:/selectOne/"+entitySaved.getId();
        return "insert";
    }

    //select one 1번글 읽어오기

    @GetMapping("/selectOne/{id}")
    public String selectOne(@PathVariable Integer id, Model model){
        TestEntity dto = testService.findById(id);
        model.addAttribute("dto",dto);
        System.out.println(dto);
        testService.findAll();
        return "selectOne";
    }

    @GetMapping("/selectAll")
    public String selectAll(Model model){
        ArrayList<TestEntity> dtos= testService.findAll();

        model.addAttribute("dtos",dtos);
        System.out.println(dtos);
        return "selectAll";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id,
                         RedirectAttributes rttr){
        TestEntity dto = testService.findById(id);
        if(dto!=null){
            testService.delete(dto);
            rttr.addFlashAttribute("msg","success");
        }

        return "redirect:/selectAll";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id,
                         Model model){
        TestEntity dto = testService.findById(id);
        model.addAttribute("dto",dto);
        return "update";
    }

    @PostMapping("/update")
    public String update(TestDto dto, Model model){
        TestEntity entity=dto.toEntity();
        System.out.println(entity.toString());
        testService.save(entity);
        return "redirect:/selectOne/"+entity.getId();
    }
}
