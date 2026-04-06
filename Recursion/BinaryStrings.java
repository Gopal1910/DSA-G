import java.util.*;

// Binary strings generate karna without consecutive 1s
public class BinaryStrings {

    public static void printBinaryString(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        // 0 to hamesha add kar sakte hain
        printBinaryString(n - 1, 0, str + "0");

        // 1 sirf tab jab lastPlace 0 ho
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
