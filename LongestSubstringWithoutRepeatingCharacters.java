class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, maxi=0;
        Set<Character>set = new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxi = Math.max(maxi, set.size());
                j++;
            }
            else {
                //set.remove(s.charAt(i));
                set.clear();
                set.add(s.charAt(j));
                j++;
            }
        }
        return maxi;
    }
}