package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class TodoTest {
    Todo todo = new Todo("some name");

    @Test
    public void todoNameIsBeingReturned() {
        assertEquals("some name", todo.getName());
    }

    @Test
    public void todoNameIsBeingSet() {
        assertEquals("new name", todo.setName("new name"));
    }

    @Test
    public void todoIsCompleted() {
        assertFalse(todo.isCompleted());
    }
}