package org.example;

public class Todo {
    private String name;
    private boolean isCompleted;

    public Todo(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String newName) {
        this.name = newName;
        return this.name;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void setCompleted() {
        this.isCompleted = true;
    }
}
