package com.SofkaU.BackToDoAPP.service;

import com.SofkaU.BackToDoAPP.entity.Task;
import java.util.List;

public interface TaskServiceInterface {

    List<Task> getAllTask();
    Task saveTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Long id);
}
