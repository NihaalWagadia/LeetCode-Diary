class Solution {
    public boolean increasingTriplet(int[] nums) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<x){
                x = nums[i];
            }
            else if(nums[i]>x && nums[i]<y){
                y = nums[i];
            }
            else if(x<y &&y<nums[i]){
                return true;
            }
        }
        return false;
    }
}
