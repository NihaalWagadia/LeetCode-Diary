class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        PriorityQueue<Map.Entry<Integer, Integer>>pq = new PriorityQueue<>((a,b) -> b.getKey()-a.getKey());
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<rectangles.length; i++){
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            map.put(min, map.getOrDefault(min, 0) +1);
            
        }
        
        for(Map.Entry<Integer, Integer>hm:map.entrySet()){
            pq.offer(hm);
        }
        return pq.poll().getValue();
    }
}
