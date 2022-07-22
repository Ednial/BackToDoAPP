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

    @OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_taskfk",referencedColumnName = "id")
    private List<Task> tasklist=new ArrayList<>();

}
