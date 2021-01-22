class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List<Integer>>hm = new HashMap<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
            max = Math.max(hm.get(nums[i]).size(), max);
        }
        int len = Integer.MAX_VALUE;
        for(Map.Entry<Integer,List<Integer>>map: hm.entrySet()){
            List<Integer>temp = map.getValue();
            System.out.println(temp.size());
            if(temp.size()==max){
               len = Math.min(Math.abs(temp.get(0)-temp.get(temp.size()-1)), len); 
            }
        }
        return len+1;
    }
}
