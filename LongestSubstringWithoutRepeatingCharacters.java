class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0, j=0, answer=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                answer = Math.max(answer, set.size());
                j++;
            }
            else{
            set.remove(s.charAt(i));
            i++;
            }
        }
        return answer;
    }
}