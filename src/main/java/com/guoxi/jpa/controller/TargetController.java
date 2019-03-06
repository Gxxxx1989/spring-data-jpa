package com.guoxi.jpa.controller;

import com.guoxi.jpa.entity.Target;
import com.guoxi.jpa.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TargetController {
    
    @Autowired
    private TargetService targetService;
    
    //添加
    @GetMapping("/save")
    public void save() {
        Target target = new Target();
        target.setTname("减肥");
        this.targetService.save(target);
    }

    //删除
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.targetService.delete(id);
    }

    //查询所有
    @GetMapping("/findAll")
    public List<Target> findAll() {
        return this.targetService.findAll();

    }
}