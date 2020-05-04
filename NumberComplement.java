class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String builder = "";
        for(int i=0; i<str.length(); i++){
             builder += (flip(str.charAt(i)));
        }
   
        return Integer.parseInt(builder,2);
    }
    
    public char flip(char c){
        return (c=='0')?'1':'0';
    }
}