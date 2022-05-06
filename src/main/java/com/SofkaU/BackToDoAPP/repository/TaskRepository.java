package com.SofkaU.BackToDoAPP.repository;


import com.SofkaU.BackToDoAPP.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {
}
