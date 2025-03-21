import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRooms {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[][] time = {{2,6},{3,7}, {1,5}, {8,9}};
//        System.out.println(Arrays.toString(time[1]));
        System.out.println(getrooms(time));
    }
    public static int getrooms(int[][] time){
        if(time.length == 0){
            return 0;
        }
        if (time.length == 1){
            return 1;
        }
        Arrays.sort(time, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        for(int[] meeting : time){
            if(!rooms.isEmpty() && rooms.peek() <= meeting[0]){
                rooms.poll();
            }
            rooms.add(meeting[1]);
        }
        return rooms.size();
    }

}
