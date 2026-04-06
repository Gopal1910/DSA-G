import java.util.*;

// N, S, E, W directions ka shortest path
public class ShortestPath {

    public static float getShortestPath(String path){

        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);

            if(dir == 'N') y++;
            else if(dir == 'S') y--;
            else if(dir == 'E') x++;
            else if(dir == 'W') x--;
        }

        // distance = √(x² + y²)
        return (float)Math.sqrt(x*x + y*y);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
