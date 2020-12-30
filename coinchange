-->break problem into smaller problem 
-->fill dp array into amount+1
-->2 for loop
-->First loop amount
-->Second loop given array
-->i should be greater than or equal to current j element
-->get min


class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        Arrays.sort(coins);
        dp[0]=0;
        for(int i =1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i], 1+dp[i-coins[j]]);
                }
                else{
                    break;
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
