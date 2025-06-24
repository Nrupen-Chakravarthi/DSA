package Intervals;
import java.util.*;

public class NonOverLappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        NonOverLappingIntervals obj = new NonOverLappingIntervals();
        Set<Integer> ans = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println(obj.eraseOverlapIntervals(intervals));
    }

    public int eraseOverlapIntervals(int[][] intervals) {

        if (intervals.length <= 1) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int count = 0;
        int[] newInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < newInterval[1]) {
                count++;
            } else {
                newInterval = intervals[i];
            }
        }
        return count;
    }
}
