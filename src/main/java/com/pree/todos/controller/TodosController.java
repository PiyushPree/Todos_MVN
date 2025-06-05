package com.pree.todos.controller;

import com.pree.todos.entity.Todos;
import com.pree.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class TodosController {

    @Autowired
    private TodosRepository tr;

    @GetMapping()
    public ModelAndView home(){
        List<Todos> todos = tr.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("todos",todos);
        return mv;
    }

    @RequestMapping(value = "/btn",method = RequestMethod.POST,params = "add")
    public ModelAndView add(Todos todos){
        tr.save(todos);
            return home();
    }
    @RequestMapping(value = "/btn",method = RequestMethod.POST,params = "update")
    public ModelAndView Update(Todos todos){
        Optional<Todos> temp = tr.findById(todos.getId());
        Todos t = null;
        if(temp.isPresent()){
            t = todos;
            tr.save(t);
        }
        return home();
    }
    @RequestMapping(value = "/btn",method = RequestMethod.POST,params = "delete")
    public ModelAndView delete(Todos todos){
        Optional<Todos> temp = tr.findById(todos.getId());
        Todos t = null;
        if(temp.isPresent()){
            t = todos;
            tr.delete(t);
        }
        return home();
    }
}
