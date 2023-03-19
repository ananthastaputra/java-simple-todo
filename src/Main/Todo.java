package Main;
import model.RegisterSystem;

import java.util.Scanner;

public class Todo {
    public static int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ToDo manager");
        System.out.println("1) Enter 1 for registration");
        System.out.println("2) enter 2 for login ");
        System.out.println("3) Enter 0 fro exit");
        int userInput = in.nextInt();
        return userInput;
    }

    public static void main(String[] args) {

       Todo todo = new Todo();
       int userInput = todo.showMenu();


       if (userInput == 1) {
           RegisterSystem Register = new RegisterSystem();
           Register.askDetails();

       } else if(userInput == 2) {

       } else if(userInput == 0) {
           System.out.println("you are exiting bye bye");
       }


    }
}
