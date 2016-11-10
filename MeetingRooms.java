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
    public boolean canAttendMeetings(Interval[] intervals) {
        
        Arrays.sort(intervals , new Comparator<Interval>(){
           public int compare(Interval obj1, Interval obj2){
               return obj1.start-obj2.start;
           }
        });
        
        for(int i=1;i<intervals.length;i++){
           if(intervals[i].start < intervals[i-1].end){
               return false;
           }
        }
        
        
        return true;
    }
}