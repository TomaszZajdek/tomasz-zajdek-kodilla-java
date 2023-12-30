package com.kodilla.hibernate.tasklist;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String description;
    private String listName;

    public TaskList() {
    }

    public TaskList(String description, String listName) {
        this.description = description;
        this.listName = listName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
@Column(name = "LISTNAME")
    private String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }
}
