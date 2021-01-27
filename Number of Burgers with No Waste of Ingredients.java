class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer>list = new ArrayList<>();
        if(tomatoSlices%2!=0)return list;
        if(tomatoSlices<cheeseSlices)return list;
        int x = (tomatoSlices-2*(cheeseSlices))/2;
        if(x%1!=0 || x<0){
            return list;
        }
        list.add(x);
        int y = cheeseSlices - x;
        if(y%1!=0 || y<0)return new ArrayList<>();
        list.add(y);
        return list;
    }
}
