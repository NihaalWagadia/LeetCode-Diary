class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st = new Stack<>();
        int i=0; 
        int curr=0;
        if(pushed.length==0 && popped.length==0){
            return true;
        }
        
        while(i<popped.length){
            st.push(pushed[i]);
            if(pushed[i]==popped[curr]){
                while( !st.isEmpty()  && curr<popped.length && st.peek()==popped[curr]){ 
                    st.pop();
                    curr++;
                }
            }
            i++;
        }
        return curr==i?true:false;
    }
}
