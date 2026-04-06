import java.util.*;

// Check karna string palindrome hai ya nahi
public class PalindromeString {

    public static void palindromeCheck(String str){

        int n = str.length();

        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("NOT a Palindrome");
                return;
            }
        }
        System.out.println("IS a Palindrome");
    }

    public static void main(String args[]){
        String str = "racecar";
        palindromeCheck(str);
    }
}
