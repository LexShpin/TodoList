package org.example;

import java.util.Scanner;

public class UserInterface {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while(true) {
            printMenu();
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 7) {
                break;
            }

            if (input == 1) {
                todoList.printAll();
            }

            if (input == 2) {
                todoList.printCompleted();
            }

            if (input == 3) {
                System.out.print("Write a task that you'd like to add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (input == 4) {
                todoList.printAll();
                System.out.print("Which task would you like to update? ");
                int number = Integer.valueOf(scanner.nextLine());
                System.out.print("What's the new task? ");
                String task = scanner.nextLine();
                todoList.updateTodo(number, task);
                System.out.println("Updated!");
            }

            if (input == 5) {
                todoList.printAll();
                System.out.print("Which task did you complete? ");
                int number = Integer.valueOf(scanner.nextLine());
                todoList.completeTodo(number);
                System.out.println("Completed!");
            }

            if (input == 6) {
                todoList.printAll();
                System.out.print("Which task would you like to remove? ");
                int number = Integer.valueOf(scanner.nextLine());
                todoList.remove(number);
                System.out.println("Removed!");
            }
        }
    }

    public void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. See all todos");
        System.out.println("2. See all completed todos");
        System.out.println("3. Add a new todo");
        System.out.println("4. Update a todo");
        System.out.println("5. Mark todo as completed");
        System.out.println("6. Remove a todo");
        System.out.println("7. Exit");
    }
}
