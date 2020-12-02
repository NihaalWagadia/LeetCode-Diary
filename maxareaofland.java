class Solution {
    boolean[][] check;
    public int maxAreaOfIsland(int[][] grid) {
        int count =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    int max =0;
                    check = new boolean[grid.length][grid[0].length];
                    count = Math.max(count, dfs(grid, i, j, max, check));
                }
            }
        }
        return count;
    }
    
    public int dfs(int[][] grid, int i, int j, int max, boolean[][] check){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || check[i][j]==true){
            return max;
        }
        max++;
        check[i][j]=true;
        max = dfs(grid, i+1, j, max, check);
        max =dfs(grid, i, j+1, max, check);
        max =dfs(grid, i, j-1, max, check);
        max =dfs(grid, i-1, j, max, check);
        return max;
    }
}
