class MyCalendar {
    List<int[]>list= new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for(int i=0; i<list.size(); i++){
            int [] checker = list.get(i);
            if((start>=checker[0] && start<=checker[1]) || (end-1 >= checker[0] && end-1 <=checker[1]) || start<=checker[0] && end-1>=checker[1]){
                return false;
            }
        }
        list.add(new int[]{start, end-1});
       // System.out.println(start+"  "+(end-1));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
