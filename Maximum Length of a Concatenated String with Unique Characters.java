class Solution {
    int leng =0;
    public int maxLength(List<String> arr) {
        dfs(arr, 0, "");
        return leng;
    }
    public void dfs(List<String>arr, int index, String temp){
        boolean check = checkDup(temp);
        if(check){
            leng = Math.max(leng, temp.length());
        }
        if(!check||index== arr.size()){
            return;
        }
        for(int i = index; i<arr.size(); i++){
            dfs(arr, i+1, temp+arr.get(i));
        }
    }
    
    public boolean checkDup(String str){
        Set<Character>set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
