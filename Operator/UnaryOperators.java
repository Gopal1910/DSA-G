import java.util.*;

// Program to demonstrate Unary Operators (++ and --)
public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;

        // Pre Increment: value pehle increase hoti hai fir assign hoti hai
        int preInc = ++a;

        // Post Increment: pehle assign hoti hai fir increase hoti hai
        int postInc = a++;

        // Pre Decrement
        int preDec = --a;

        // Post Decrement
        int postDec = a--;

        System.out.println("Final Value of a = " + a);
        System.out.println("Pre Increment Value = " + preInc);
        System.out.println("Post Increment Value = " + postInc);
        System.out.println("Pre Decrement Value = " + preDec);
        System.out.println("Post Decrement Value = " + postDec);
    }
}
