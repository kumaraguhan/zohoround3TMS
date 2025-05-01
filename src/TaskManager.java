package round3Zoho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskManager {
    Map<Integer, Task> tasks = new HashMap<>();
    int idCounter = 0;
    Scanner sc = new Scanner(System.in);

    public void addTask() {
        System.out.println("Enter Task Name");
        String name = sc.nextLine();
        tasks.put(++idCounter, new Task(idCounter, name));
        System.out.println("Task added successfully");
    }

    public void viewTask() {
        for(Map.Entry<Integer, Task> task: tasks.entrySet()){
            System.out.printf("%-2d. %-8s", task.getKey(), task.getValue().getTaskName());
        }
    }
}
