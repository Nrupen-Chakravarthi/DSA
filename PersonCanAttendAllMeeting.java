import java.util.PriorityQueue;

public class PersonCanAttendAllMeeting {
    public static void main(String[] args) {
        int[][] intervals = {{0,30},{30,40},{40,50}};
        System.out.println( canAttend());
    }
    public static boolean canAttend() {
        int[][] intervals = {{0,30},{30,40},{40,50}};
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int[] arr : intervals){
            if(que.isEmpty()){
                que.add(arr[1]);
            } else if (que.peek() <= arr[0]) {
                que.poll();
                que.add(arr[1]);
            }
            else if (que.peek() > arr[0]){
                return false;
            }
        }
        return true;
    }
}
