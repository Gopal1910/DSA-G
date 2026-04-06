import java.util.*;

// String compression (aaa → a3)
public class StringCompression {

    public static String compress(String str){

        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            int count = 1;

            // same character count karna
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            newStr.append(str.charAt(i));

            if(count > 1){
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String args[]){
        String str = "aaaabbbcccddd";
        System.out.println(compress(str));
    }
}
