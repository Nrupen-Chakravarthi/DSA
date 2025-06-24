package Intervals;
import java.util.Arrays;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length + 1][2];
        int i = 0, j = 0;


        //Add all the intervals that end before the new interval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
            result[j++] = intervals[i++];
        }

        //Merge overlapping intervals
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i++][1], newInterval[1]);
        }

        result[j++] = newInterval;

        while (i < intervals.length){
            result[j++] = intervals[i++];
        }

        return Arrays.copyOf(result, j);
    }
}
