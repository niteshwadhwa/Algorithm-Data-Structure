/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
      
        int[] arr = new int[intervals.length];
        TreeMap<Integer, Integer> tree= new TreeMap<Integer, Integer>();
        
        for(int i=0;i<intervals.length;i++){
            tree.put(intervals[i].start, i);
        }
        
        for(int i=0;i<intervals.length;i++){
            Integer key = tree.ceilingKey(intervals[i].end);
            if(key != null) arr[i] = tree.get((int)key);
            else arr[i] = -1;
        }
        
        return arr;
        
    } 
}