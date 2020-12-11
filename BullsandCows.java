class Solution {
    public String getHint(String secret, String guess) {
        
        //length-bull-sum(int[]'s sum)
        int[] arr = new int[10];
        int bull=0;
        for(int i=0; i<guess.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            else{
                arr[Character.getNumericValue(secret.charAt(i))]++;
                arr[Character.getNumericValue(guess.charAt(i))]--;
               // System.out.println(arr[Character.getNumericValue(guess.charAt(i))]);
            }
        }
        int sum =0;
        for(int i=0; i<10; i++){
            if(arr[i]>0){
                sum += arr[i];
            }
        }
        int cow = secret.length()-bull-sum;
       // System.out.println(cow);
        return String.valueOf(bull)+"A"+String.valueOf(cow)+"B";
    }
}
