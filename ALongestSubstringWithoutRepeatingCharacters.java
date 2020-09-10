class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2)return s.length();
        Set<Character>set = new HashSet<>();
        int max = -1;
        int i=0, j=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            else{
                set.add(s.charAt(i));
                i++;
                max = Math.max(max, i-j);

            }
        }
        return max;
    }
}
