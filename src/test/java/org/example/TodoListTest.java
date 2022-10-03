package org.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListTest {

    TodoList todoList = new TodoList();

    @Test
    public void todoGetsAdded() {
        int previousSize = this.todoList.getTodoSize();
        todoList.add("some todo");
        assertEquals(previousSize + 1, this.todoList.getTodoSize());
    }

    @Test
    public void todoGetsRemoved() {
        todoList.add("some todo");
        int previousSize = this.todoList.getTodoSize();
        todoList.remove(1);
        assertEquals(previousSize - 1, this.todoList.getTodoSize());
    }

    @Test
    public void todoGetsCompleted() {
        int previousSizeCompleted = this.todoList.getCompletedSize();
        todoList.add("new todo");
        int previousSizeTodos = this.todoList.getTodoSize();
        todoList.completeTodo(0);
        assertEquals(previousSizeTodos - 1, this.todoList.getTodoSize());
        assertEquals(previousSizeCompleted + 1, this.todoList.getCompletedSize());
    }

    @Test
    public void todoGetsUpdated() {
        todoList.add("new todo");
        todoList.updateTodo(1, "buy milk");
        assertEquals("buy milk", todoList.getTodo(1));
    }
}