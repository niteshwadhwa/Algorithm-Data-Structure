public class Solution {
    public int compareVersion(String version1, String version2) {
       
       ArrayList<Integer> arr1 = new ArrayList<Integer>();
       ArrayList<Integer> arr2 = new ArrayList<Integer>();
       
       for(String str1:version1.split("\\.")){
           arr1.add(Integer.parseInt(str1));
       }
       
       for(String str2:version2.split("\\.")){
           arr2.add(Integer.parseInt(str2));
       }
       
       while(arr1.size() > arr2.size()){
           arr2.add(0);
       }
       
       while(arr2.size() > arr1.size()){
           arr1.add(0);
       }
       
       for(int i=0;i<arr1.size();i++){
            if(arr1.get(i) > arr2.get(i)){
                return 1;
            }else if(arr1.get(i) < arr2.get(i)){
                return -1;
            }
       }
       
       return 0;
    }
}