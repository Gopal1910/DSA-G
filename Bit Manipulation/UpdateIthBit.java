import java.util.*;

// ith bit ko 0 ya 1 update karna
public class UpdateIthBit {

    public static int updateIthBit(int n, int i, int newBit){

        // pehle ith bit clear karo
        n = clearIthBit(n, i);

        // phir new bit set karo
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // helper function
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(updateIthBit(10, 2, 1));
    }
}
