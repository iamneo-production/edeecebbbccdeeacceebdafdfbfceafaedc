package com.examly.springapp.TaskRepository;

import org.springframework.data.repository.CrudRepository;
import com.examly.springapp.model.Task;

public interface TaskRepository extends CrudRepository<Task, String> {
    
}
