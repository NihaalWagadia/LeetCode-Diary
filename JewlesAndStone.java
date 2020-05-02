class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character>hm = new HashSet<>();
       
        int out = 0;
        for(int i=0; i<J.length(); i++){
            hm.add(J.charAt(i));
        }
        for(int i=0; i<S.length(); i++){
            if(hm.contains(S.charAt(i))){
                out++;
            }
        }
        return out;
    }
}