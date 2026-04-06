import java.util.*;

// Array ko function me pass karke update karna
public class UpdateArray {

    // Ye function array ke har element me +1 karega
    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {66, 67, 68};

        update(marks); // function call

        // Updated marks print karna
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
