package model;
import java.util.*;
import model.*;

import static model.RegisterSystem.users;
import static model.TodoSystem.taskDetails;



public class LoginSystem {
     public static boolean isLoggedIn = false;
    RegisterSystem registration = new RegisterSystem();

     public LoginSystem() {

     }

    public static boolean isLoggedIn() {
        return isLoggedIn;
    }

    public  boolean validateUser(String email, String password) {

//         if (registration.validateUser(email, password)) {
//
//             System.out.println("you are validated ");
//             return true;
//         } else {
//             return false;
//         }
        boolean res = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).email.equals(email) && users.get(i).password.equals(password)) {
//                isRegistered = true;
                res = true;
                break;
            } else {
                res = false;
            }
        }
        return res;

    }

    public void loginUser() {
        taskDetails();
    }

    public  void loginDetails() {
         Scanner in = new Scanner(System.in);
         System.out.println("enter the email : ");
         String email = in.nextLine();

         System.out.println("enter the password : ");
         String password = in.nextLine();

         boolean validationResult = validateUser(email,password);

         if (validationResult) {

             //loginUser();
             isLoggedIn = true;
             System.out.println("you are successfully logged in ");
             loginUser();

         } else {
             System.out.println("you are not  a user go to registration system");
             registration.askDetails();
         }




    }
}
