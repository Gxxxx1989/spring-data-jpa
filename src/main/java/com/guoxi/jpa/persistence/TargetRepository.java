package com.guoxi.jpa.persistence;

import com.guoxi.jpa.entity.Target;
import org.springframework.data.repository.CrudRepository;

public interface TargetRepository extends CrudRepository<Target,Integer> {
}