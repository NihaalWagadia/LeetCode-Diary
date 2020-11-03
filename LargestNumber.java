class Solution {
    public String largestNumber(int[] nums) {
        String []string = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            string[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(string, new Comp());
        String output = "";
        if(string[0].equals("0"))return "0";
        for(String s : string){
            output += s;
        }
        return output;
    }
    
    public class Comp implements Comparator<String>{
        public int compare(String a, String b){
            String forward = a+b;
            String backwards = b+a;
            return backwards.compareTo(forward);
        }
    }
}
