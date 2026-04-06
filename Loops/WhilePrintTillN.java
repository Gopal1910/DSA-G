import java.util.*;

// Print numbers from 1 to n
public class WhilePrintTillN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range: ");
        int range = sc.nextInt();

        int counter = 1;

        while(counter <= range){
            System.out.println(counter);
            counter++;
        }
    }
}
