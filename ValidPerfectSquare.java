class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==2||num==3)return false;
        if(num==1)return true;
        long i=2;
        while((i*i)<num){
            i++;
        }
        if(i*i==num)return true;
        return false;
    }
}