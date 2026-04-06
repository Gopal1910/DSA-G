import java.util.*;

// String ke har character ko print karna
public class PrintStringChars {

    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String fullName = "Gopal Kumar";
        printLetters(fullName);
    }
}
