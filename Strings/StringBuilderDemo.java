import java.util.*;

// StringBuilder fast hota hai (mutable)
public class StringBuilderDemo {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); // string ke piche add
        }

        System.out.println(sb);
        System.out.println("Length = " + sb.length());
    }
}
