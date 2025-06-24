package ArraysStrings;

import java.util.*;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freqMap = new HashMap<>();
       for(int i : nums){
           freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a));
       maxHeap.addAll(freqMap.keySet());
       int[] ans = new int[k];
       for(int i= 0; i < k; i++){
           ans[i] = maxHeap.poll();
       }
       return ans;
    }
}
