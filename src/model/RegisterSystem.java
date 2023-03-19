package model;
import java.util.*;
import model.*;
import Main.*;


import java.util.ArrayList;

public class RegisterSystem {

    public static  boolean isRegistered = false;

    public static ArrayList<User> users = new ArrayList<>();

    public void setUsers(String name,String email, String password) {
        users.add(new User(name,email,password));
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public  boolean validateName(String name) {
        boolean res = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equals(name)) {
                res = true;
                break;
            } else {
                res = false;
            }
        }
        return res;
    }

    public boolean validateEmail (String email) {
        boolean res = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(email)) {
                res = true;
                break;
            } else {
                res = false;
            }
        }

        return res;
    }

    public boolean validateUser(String email, String password) {
        boolean res = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).email.equals(email) && users.get(i).password.equals(password)) {
                isRegistered = true;
                res = true;
                break;
            } else {
                res = false;
            }
        }
        return res;
    }

    public void askDetails() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your name : ");
        String name = in.nextLine();

        System.out.println("enter your email : ");
        String email = in.nextLine();

        System.out.println("enter your password : ");
        String password = in.nextLine();

        if (!validateUser(email,password)) {
            if (!validateName(name)) {
                setUsers(name,email,password);
                isRegistered = true;
            } else {
                System.out.println("this name is already set pls use another name");

            }
        }
        else {
            System.out.println("you are already registered");
        }



        System.out.println("you are now registered, pls go to login screen ");

        System.out.println("1) Login \n 0) exit");
        System.out.println("enter your choice ");

        int userChoice = in.nextInt();

        if (userChoice == 1) {
            LoginSystem login  = new LoginSystem();
            login.loginDetails();


        } else if (userChoice == 2) {
            System.exit(0);
        }


    }
}
