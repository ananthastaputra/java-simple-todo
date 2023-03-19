package model;

import java.util.ArrayList;
import java.util.Scanner;

import static model.LoginSystem.*;

public class TodoSystem {

    public String taskText = "";
    public String taskTitle = "";

    public static int  taskId;
    public static int taskCount = 0;

    public boolean taskDeleted = false;

    public boolean taskCompleted = false;
    public static ArrayList<TodoSystem> taskList = new ArrayList<>();


    public TodoSystem(int id, String title, String task) {
        this.taskId = id;
        this.taskTitle = title;
        this.taskText = task;

    }
    public boolean isEmpty () {
        if (taskCount == 0) return true;
        else {
            return false;
        }
    }

    public static void showTask() {
        if (taskCount == 0) {
            System.out.println("there are no tasks to show");
        } else {
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(taskList.get(i).taskId);
                System.out.println(taskList.get(i).taskTitle);
                System.out.println(taskList.get(i).taskText);
            }

        }
    }

    public  static void createTask(int id,String title, String task) {
        taskList.add(new TodoSystem(id,title,task));
    }


    public static void taskDetails() {
        Scanner in = new Scanner(System.in);

        System.out.println("welcome to this space");

        System.out.println("press 1 to show ur tasks \n \"press 2 to create ur own task\"");
        int res = in.nextInt();

        if(res == 1) {
            showTask();
        } else {
            System.out.println("enter the task id");
            int id = in.nextInt();

            System.out.println("enter the task Title ");
            String title = in.nextLine();

            System.out.println("enter the task details");
            String task = in.nextLine();

            createTask(id,title,task);



        }


    }




}
