import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int storeWater(ArrayList<Integer> height) {
        int max = 0;
        int left = 0, right = height.size() - 1;

        while (left < right) {
            int h = Math.min(height.get(left), height.get(right));
            int w = right - left;
            max = Math.max(max, h * w);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
