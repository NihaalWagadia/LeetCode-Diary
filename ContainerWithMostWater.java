class Solution {
    public int maxArea(int[] height) {
        int maxi = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int mini = Math.min(height[i], height[j]);
                maxi = Math.max(maxi,(mini*(j-i)));
            }
        }
        return maxi;
    }
}