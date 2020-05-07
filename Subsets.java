class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        sub(nums, list, new ArrayList<>(), 0);
        return list;
    }
    
    public void sub(int[] nums, List<List<Integer>>list, List<Integer>temp, int in){
        list.add(new ArrayList<>(temp));
        for(int i=in; i<nums.length; i++){
            if(temp.contains(nums[i]))continue;
            temp.add(nums[i]);
            sub(nums, list, temp, i);
            temp.remove(temp.size()-1);
        }
        return;
    }
}