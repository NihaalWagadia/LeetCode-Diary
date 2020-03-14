import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>hm = new HashMap<>();
        Arrays.sort(nums);
        int out =0;
        int maj =0;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            }
            else {
                hm.put(nums[i],1);
            }
            if(hm.get(nums[i])>(n/2)){
                maj=nums[i];
                break;
            }
        }
        return maj;
    }
}