class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==2||num==3)return false;
        if(num==1)return true;
        long val = 2;
        Stack<Long>stack = new Stack<>();
        while((val*val)<num){
            val *= val;
            stack.push(val);
        }
        long end = stack.isEmpty()?4:stack.pop();
        long init = stack.isEmpty()?2:stack.pop();
        for(long i = init; i<=end; i++){
          long mul = i*i;
            if(mul == num){
                return true;
            }
            else if(mul>num){
                return false;
            }
        }
        return false;
    }
}