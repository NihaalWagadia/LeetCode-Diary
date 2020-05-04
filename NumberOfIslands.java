class Solution {
    public int numIslands(char[][] grid) {
        int number_islands =0;
     // System.out.println(grid.length+"row");
     // System.out.println(grid[0].length+"height");
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    number_islands++;
                    rec(grid, i, j, grid.length, grid[0].length);
                }
                
            }
        }
        return number_islands;
    }
    public void rec(char[][] grid, int x, int y, int row, int col){
        if(x<0)return;
        if(y<0)return;
        if(x>=row)return;
        if(y>=col)return;
        if(grid[x][y]!='1')return;
        //System.out.println();
        
        grid[x][y]='2';
        rec(grid, x+1, y, row, col);
        rec(grid, x-1, y, row, col);
        rec(grid, x, y-1, row, col);
        rec(grid, x, y+1, row, col);
        
    }
}