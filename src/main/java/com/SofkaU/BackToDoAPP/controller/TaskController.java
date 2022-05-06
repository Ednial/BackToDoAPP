package com.SofkaU.BackToDoAPP.controller;

import com.SofkaU.BackToDoAPP.entity.Task;
import com.SofkaU.BackToDoAPP.service.TaskServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class TaskController {
    @Autowired
    private TaskServiceInterface service;

    @GetMapping("get/tasks")
    public List<Task> getAllTask(){
        return service.getAllTask();
    }
    @PostMapping("save/task")
    public Task saveTask(@RequestBody Task task){
        return service.saveTask(task);
    }
    @PutMapping("update/task")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }
    @DeleteMapping("delete/task/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }
}
