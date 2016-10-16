public class Solution {
    public String intToRoman(int num) {
        
       String[] first = {"","I","II","III","IV","V","VI","VII","VIII","IX",};
       String[] second ={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
       String[] third = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
       String[] fourth = {"","M","MM","MMM"};
       
       return (fourth[num/1000]+third[(num%1000)/100]+second[(num%100)/10]+first[(num%10)]);
       
    }
}