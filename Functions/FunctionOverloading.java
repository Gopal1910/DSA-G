import java.util.*;

// Same function name but different parameters
public class FunctionOverloading {

    // int version
    public static int sum(int a,int b){
        return a+b;
    }

    // float version
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(sum(5,6));         // int wala chalega
        System.out.println(sum(5.5f,6.5f));   // float wala chalega
    }
}
