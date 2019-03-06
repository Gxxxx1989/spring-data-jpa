package com.guoxi.jpa.service;

import com.guoxi.jpa.entity.Target;
import com.guoxi.jpa.persistence.TargetRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TargetServiceimpl implements TargetService{
    // @Resource是根据名称注入 @Autowired是根据类型注入
    @Resource
    private TargetRepository targetRepository;

    //添加
    @Override
    public void save(Target target) {
        this.targetRepository.save(target);
    }

    //删除
    @Override
    public void delete(Integer id) {
        this.targetRepository.deleteById(id);
    }

    //查询
    @Override
    public List<Target> findAll(){
        return (List<Target>) this.targetRepository.findAll();
    }


}