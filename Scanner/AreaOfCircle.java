import java.util.*;

// Program to calculate Area of Circle
public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        float rad = sc.nextFloat();

        float area = 3.14f * rad * rad;

        System.out.println("Area of Circle = " + area);
    }
}
