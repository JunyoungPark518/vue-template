package com.vue.jypark.repository;

import com.vue.jypark.model.Template;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexR extends CrudRepository<Template, Integer> {

}
