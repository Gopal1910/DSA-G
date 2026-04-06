import java.util.*;

// Keep taking input until user enters multiple of 10
public class BreakOnTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter Number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;     // loop stops here
            }

            System.out.println("You Entered: " + n);

        }while(true);
    }
}
