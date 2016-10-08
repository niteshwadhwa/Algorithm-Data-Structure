public class Solution {
    public List<String> readBinaryWatch(int num) {
        
        List<String> str = new ArrayList<String>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j) == num){
                    str.add(String.format("%1d:%02d",i,j));
                }
            }
        }
        return str;
    }
}