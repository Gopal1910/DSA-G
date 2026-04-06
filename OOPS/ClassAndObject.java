import java.util.*;

// Class and Object basic example
public class ClassAndObject {
    public static void main(String[] args) {

        Pen p1 = new Pen();      // object creation
        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

// Pen class
class Pen {
    private String color;   // data hiding
    private int tip;

    // setter methods
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    // getter methods
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
}
