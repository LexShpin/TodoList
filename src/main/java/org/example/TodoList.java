package org.example;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;
    private ArrayList<String> completedTodos;

    public TodoList() {
        this.todos = new ArrayList<>();
        this.completedTodos = new ArrayList<>();
    }

    public void add(String todo) {
        this.todos.add(todo);
    }

    public void remove(int number) {
        this.todos.remove(number - 1);
    }

    public void updateTodo(int number, String text) {
        this.todos.set(number - 1, text);
    }

    public void printAll() {
        System.out.println("Current tasks: ");
        for (int i = 0; i < this.todos.size(); i++) {
            System.out.println((i + 1) + ": " + this.todos.get(i));
        }
        System.out.println();
    }

    public String getTodo(int number) {
        return this.todos.get(number - 1);
    }

    public int getTodoSize() {
        return this.todos.size();
    }

    public void completeTodo(int number) {
        this.completedTodos.add(this.todos.get(number));
        this.todos.remove(number);
    }

    public int getCompletedSize() {
        return this.completedTodos.size();
    }

    public void printCompleted() {
        System.out.println("Completed tasks: ");
        for (int i = 0; i < this.completedTodos.size(); i++) {
            System.out.println((i + 1) + ": " + this.completedTodos.get(i));
        }
        System.out.println();
    }
}
