package com.companyname.habittracking;

import com.companyname.habittracking.entities.Habit;
import com.companyname.habittracking.entities.Task;

public class App {
    public static void main(String[] args) {
        Task task = Task.builder().name("Tarefa").build();
        Habit habit = Habit.builder().name("Hábito").build();
        System.out.println(task.getName());
        System.out.println(habit.getName());
    }
}
