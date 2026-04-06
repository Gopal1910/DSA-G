import java.util.*;

public class IfElseAdultCheck {
    public static void main(String[] args) {

        // Program to check Adult / Teen / Not Adult
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age >= 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}
