public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if(n==1){
            return s;
        }else{
            for(int i=1;i<n;i++){
                s = calculateNewNumber(s);
            }
            return s;
        }
    }
    
    public String calculateNewNumber(String s){
       
        String s1 = "";
        int count = 0;
        char curr = 'a';
        char pre ='b';
       
        for(int i=0;i<s.length();i++){
            if(i==0){
                pre = s.charAt(i);
                count++;
            }else{
                curr = s.charAt(i);
                if(curr == pre){
                    count++;
                }else{
                    s1 = s1+count;
                    s1 = s1+String.valueOf(pre);
                    pre = curr;
                    count = 1;
                }
            }
        }
        s1 = s1+count;
        s1 = s1+String.valueOf(pre);
        return s1;
    }
}