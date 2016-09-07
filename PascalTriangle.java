import java.util.*;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
            
            List<List<Integer>> outerList = new LinkedList<>();
            int count = 0;
            while(count < numRows){
                List<Integer> innerList = new LinkedList<Integer>();
                for(int i=0;i<=count;i++){
                    if(i==0){
                        innerList.add(1);
                    }else if(i == count){
                        innerList.add(1);
                    }else{
                        innerList.add(outerList.get(count-1).get(i)+outerList.get(count-1).get(i-1));
                    }
                }
                outerList.add(innerList);
                count++;
            }
            return outerList;
    }
}