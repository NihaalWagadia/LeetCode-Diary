class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2)return nums[0]>nums[1]?0:1;  
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(nums[0]>nums[i+1]){
                 return i;   
                }
            }
            else if(i==nums.length-1){
                return i;
            }
            
            else if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }
}
