// Master ////


public class Solution {
    public int bulbSwitch(int n) {
        
        return (int) Math.sqrt(n);
    }
}




// Improved //////

public class Solution {
    public int bulbSwitch(int n) {
        
        if( n == 0){
            return 0;
        }
        
        int count = 1;
        int j = 3;
        int i = 3;
        
        while(i < n){
            j = j+2;
            i = i + j;
            count++;
        }
        
        return count;
        
    }
}



/// first attemp //////

public class Solution {
    public int bulbSwitch(int n) {
        
        int arr[] = new int[n];
        int count = 0;
        int j = 0;
        
        for(int i=1;i<n;i++){
            j=i;
            while(j<n){
                if(arr[j] == 1){
                    arr[j] = 0;
                }else{
                    arr[j] = 1;
                }    
                j = j+(i+1);
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count++;
            }
        }
        
        return count;
        
    }
}