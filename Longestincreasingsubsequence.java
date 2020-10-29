class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length ==0)return 0;
        int maxans =1;
        dp[0]=1;
        for(int i=1; i<nums.length; i++){
            int max =0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                max = Math.max(max, dp[j]);
                }
            }
            dp[i]=max+1;
            maxans = Math.max(maxans, dp[i]);
            
            
        }
        return maxans;
    }
}
