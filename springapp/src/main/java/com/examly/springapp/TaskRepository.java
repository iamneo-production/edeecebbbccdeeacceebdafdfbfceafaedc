package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;
import com.examly.springapp.Task;

public interface TaskRepository extends CrudRepository<Task, String> {
    
}
