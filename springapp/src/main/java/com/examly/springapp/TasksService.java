package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TasksService {
    @Autowired    
    TaskRepository tasksRepository;

    public List<Task> getAllTasks()    {
        return (List<Task>) tasksRepository.findAll();
    }

    public Task getTaskById(String taskId) {
        return tasksRepository.findById(taskId).orElse(null);
    }


    public void saveTasks(Task task)    {
        tasksRepository.save(task);
    }

    public void delete(String taskId)    {
        tasksRepository.deleteById(taskId);
    }

    public void updateTaskStatus(Task task) {
        tasksRepository.save(task);
    }
}




