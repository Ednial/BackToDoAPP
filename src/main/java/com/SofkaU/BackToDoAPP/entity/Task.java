package com.SofkaU.BackToDoAPP.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Task")
@Table(name = "task")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String message;

    private long FK_DoListId;
}
