package Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        CarFleet o = new CarFleet();
        int[] position = {0,4,2};
        int[] spedd = {2,1,3};
        System.out.println(o.carFleet(10, position, spedd));
    }
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] arr = new double[position.length][2];
        Stack<Double> s = new Stack<>();
        for(int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / speed[i];
            arr[i] = new double[]{position[i], time};
        }
        Arrays.sort(arr, (a,b) -> Double.compare(b[0], a[0]));
        //we have to check for the fleet
        for(double[] car : arr) {
            double time = car[1];
            if (s.isEmpty() || time > s.peek()) {
                s.push(time);
            }
        }
        return s.size();
    }
}
