package com.guoxi.jpa.service;


import com.guoxi.jpa.entity.Target;

import java.util.List;

public interface TargetService {
    public void save(Target target);
    public void delete(Integer id);
    public List<Target> findAll();
}
