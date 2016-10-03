/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       
        int x = 1;
        int y = n;
        int mid = 0;
        if( n <= 1){
              return n;
        }else if(isBadVersion(x)){
             return x; 
        }else{
             while( (x+1) != y){
                mid = x + (y-x)/2;
                if(isBadVersion(mid)){
                      y = mid;
                }else{
                      x = mid;
                }
             }
          
          return (x+1);
        }
    }
}