package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {0,6},
                {8,10},
                {15,18}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));

    }
    public static int[][] merge(int[][] intervals){
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] temp = intervals[0];
        for(int[] i : intervals){
            if(i[0] < temp[1]){
                temp[1] = Math.max(i[1], temp[1]);
            }
            if(i[0] <= temp[0]){
                temp[0] = Math.min(i[0], temp[0]);
            }
            else {
                result.add(temp);
                temp = i;
            }
        }
        result.add(temp);
        return result.toArray(new int[result.size()][]);
    }
}
