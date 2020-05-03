class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())return false;
        Map<Character,Integer>hm = new HashMap<>();
        Map<Character,Integer>hmR = new HashMap<>();
        
        for(int i=0;i<magazine.length(); i++){
            if(hm.containsKey(magazine.charAt(i))){
                hm.put(magazine.charAt(i), hm.getOrDefault(magazine.charAt(i),0)+1);
            }
            else{
                hm.put(magazine.charAt(i),1);
            }
        }
        
         for(int i=0;i<ransomNote.length(); i++){
            if(hmR.containsKey(ransomNote.charAt(i))){
                hmR.put(ransomNote.charAt(i), hmR.getOrDefault(ransomNote.charAt(i),0)+1);
            }
            else{
                hmR.put(ransomNote.charAt(i),1);
            }
        }
                    //System.out.println(hm.get(magazine.charAt(1)));

        for(int i=0;i<ransomNote.length(); i++){
            int r = hmR.get(ransomNote.charAt(i));
            int m = hm.containsKey(ransomNote.charAt(i))==true ? hm.get(ransomNote.charAt(i)): 0;
           // System.out.println(r+"  "+m);
            if(m==0)return false;
            if(r>m)return false;
        }
        return true;
        
    }
}