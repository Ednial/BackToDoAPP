package com.SofkaU.BackToDoAPP.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "DoList")
@Table(name = "doList")
@Data//add getters and setters thanks to lombok
public class DoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private List<Task> tasklist=new ArrayList<>();

    @OneToMany
    public DoList addTask(Task task){
        this.tasklist.add(task);
        return this;
    }

}
