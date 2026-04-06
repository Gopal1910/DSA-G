import java.util.*;

// Interface example
public class InterfaceDemo {
    public static void main(String[] args) {

        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Moves in all directions");
    }
}
