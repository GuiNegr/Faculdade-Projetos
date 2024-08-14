package com.TaskList.TaskList.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

//com spring posso utilziar a classe entity para indicar que será um valor modelo, para a inserção no bd

@Entity
public class Task implements Serializable {

    private static final long SERIALVERSIONID= 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTask;

    private String nameTask;
    private String descTask;
    private String statusTask;

    public long getIdTask() {
        return idTask;
    }

    public void setIdTask(long idTask) {
        this.idTask = idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public String getStatusTask() {
        return statusTask;
    }

    public void setStatusTask(String statusTask) {
        this.statusTask = statusTask;
    }
}
