public class Solution{
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people, new Comparator<int[]>(){
           public int compare(int[] o1, int[] o2){
               if(o1[0] != o2[0]){
                   return o2[0]-o1[0];
               }else{
                   return o1[1]-o2[1];
               }
           }
        });
    
       List<int[]> list = new LinkedList<int[]>();
       for(int[] element: people){
           list.add(element[1],element);    
       }
       
       return list.toArray(new int[people.length][2]);
    }
    
}