package com.pocket.controller;

import com.pocket.dto.QuestionDTO;
import com.pocket.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther Akie
 * @date 2019/10/18 20:30
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        //累加浏览数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}
