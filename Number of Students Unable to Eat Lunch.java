class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        for(int i: students){
            arr[i]++;
        }
        for(int i=0; i<sandwiches.length; i++){
            int val = sandwiches[i];
            if(arr[val]>0){
                arr[val]--;
            }
            else{
                break;
            }
            
        }
        return arr[0]+arr[1];
    }
}
