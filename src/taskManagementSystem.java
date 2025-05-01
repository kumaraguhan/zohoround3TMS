package round3Zoho;

import java.util.Scanner;

public class taskManagementSystem {
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        boolean cont = true;
        while (cont) {
            System.out.println("\n1. Add Task\n2. View Tasks\n0. Exit");
            System.out.println("Enter User Choice");
            int userChoice = sc.nextInt();
            switch(userChoice){
                case 1:
                    taskManager.addTask();
                    break;
                case 2:
                    taskManager.viewTask();
                    break;
                case 0:
                    cont=false;

        }


        }sc.close();

    }
}
