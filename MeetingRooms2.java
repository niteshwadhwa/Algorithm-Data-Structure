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
    public int minMeetingRooms(Interval[] intervals) {
        
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals , new Comparator<Interval>(){
           
           public int compare(Interval obj1, Interval obj2){
               return obj1.start - obj2.start;
           }
            
        });
        
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        int count = 1;
        treeset.add(intervals[0].end);
        
        for(int i=1;i<intervals.length;i++){
            int endTime = treeset.pollFirst();
            if(endTime <= intervals[i].start){
                treeset.add(intervals[i].end);
            }else{
                count++;
                treeset.add(intervals[i].end);
                treeset.add(endTime);
            }
        }
        
        return count;
        
    }
}