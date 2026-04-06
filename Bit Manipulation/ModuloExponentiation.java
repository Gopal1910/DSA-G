import java.util.*;

// (a^n) % mod calculate karna
public class ModuloExponentiation {

    public static int moduloExpo(int a, int n, int mod){

        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]){
        System.out.println(moduloExpo(3, 5, 1000000007));
    }
}
