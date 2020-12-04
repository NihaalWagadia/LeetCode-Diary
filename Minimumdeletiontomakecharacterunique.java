class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer>hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character>pq = new PriorityQueue<>((a,b)-> hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        int min_deletion=0;
        while(pq.size()>1){
            char x = pq.poll();
            char y = pq.poll();
            int a = hm.get(x);
            int b = hm.get(y);
            if(a == b){
                min_deletion++;
                if(a==1){
                    pq.add(y);
                }
                else{
                    hm.put(x, hm.get(x)-1);
                    pq.add(x);
                    pq.add(y);
                }
            }
            else {
                pq.add(y);
            }
        }
        return min_deletion;
    }
}
