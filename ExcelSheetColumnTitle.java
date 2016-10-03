public class Solution {
    public String convertToTitle(int n) {
        if(n > 0){
            String s = "";
            HashMap<Integer, String> hash = new HashMap<Integer, String>();
            hash.put(1,"A");hash.put(2,"B");hash.put(3,"C");hash.put(4,"D");hash.put(5,"E");hash.put(6,"F");hash.put(7,"G");
            hash.put(8,"H");hash.put(9,"I");hash.put(10,"J");hash.put(11,"K");hash.put(12,"L");hash.put(13,"M");hash.put(14,"N");
            hash.put(15,"O");hash.put(16,"P");hash.put(17,"Q");hash.put(18,"R");hash.put(19,"S");hash.put(20,"T");hash.put(21,"U");
            hash.put(22,"V");hash.put(23,"W");hash.put(24,"X");hash.put(25,"Y");hash.put(26,"Z");
           
            while(n > 0){
                if( n <= 26){
                    s = hash.get(n)+s;
                    break;
                }else{
                    if(n%26 == 0){
                        s = "Z"+s;
                        n = (n/26)-1;
                    }else{
                        s = hash.get(n%26)+s;
                        n = n/26;
                    }
                }
            }
            return s;
        }else{
            return null;
        }
    }
}