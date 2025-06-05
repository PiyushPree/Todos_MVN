package com.pree.todos.entity;

import jakarta.persistence.*;

@Entity
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private  Priority priority;

    public Todos(){}

    public Todos(Integer id, String title, String description, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\''+
                '}';
    }
}
