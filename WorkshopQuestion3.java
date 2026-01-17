package GitHubWorkshopQuestions;

import java.util.Scanner;

public class WorkshopQuestion3 {
    public static boolean isValidUsername(String username){
        if(username == null || username.isEmpty()){
            System.out.println("No input detected");
            return false;
        }
        
        if(username == "admin"){ //ERROR: when comparing Strings, use equals() or equalsIgnoreCase()
            System.out.println("Admin is already taken");
            return false;
        }

        if(username.length() > 5){ //ERROR: wrong comparator, should use "<" 
            System.out.println("Must contain at least 5 characters");
            return false;
        }

        char firstChar = username.charAt(1); //ERROR: first char starts at index 0, not 1
        if(Character.isDigit(firstChar)){
            System.out.println("Cannot start with a number");
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String username;
        System.out.print("Please enter a username -> ");
        username = input.nextLine();

        boolean valid = isValidUsername(username);
        if(valid){
            System.out.println("Cool username bro");
        } else{
            System.out.println("Invalid username!");
        }
        
        input.close();
    }
}
