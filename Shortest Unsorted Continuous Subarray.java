class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int firstNonMatching = 0;
        int lastNonMatching = 0;
        List<Integer>list = new ArrayList<>();
        int[] dup = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dup[i]= nums[i];
        }
        Arrays.sort(dup);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=dup[i]){
                list.add(i);
            }
        }
        return list.size()==0?0:list.get(list.size()-1)-list.get(0)+1;
    }
}
