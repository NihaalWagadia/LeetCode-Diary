class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maximum =-1;
        for(int i= s.length()-1; i>=0; i--){
            for(int j =0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    maximum = Math.max(maximum, (i-1)-(j));
                }
            }
        }
        return maximum;
    }
}
