class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length; 
        int n = grid[0].length;
        boolean [][] visited = new boolean [m][n];
      Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i< m; i++){
            for(int j = 0; j< n ;j++){
                if(grid[i][j] == 0){
                   {
                      q.add(new int[]{i,j,0});
                    }
                }
            }
        }
        int [] dRow = {1,-1,0,0};
                int [] dCol = {0,0,1,-1};

                while(!q.isEmpty()){
                    int[] ceil = q.poll();
                    int r = ceil[0];
                    int c = ceil[1];
                    int dis = ceil[2];
                    for(int k = 0 ; k < 4 ; k++){
                        int nr = r + dRow[k];
                        int nc = c + dCol[k];
                        
                        if(nr >= 0 && nr <= m-1 && nc >= 0 && nc <= n-1 && grid[nr][nc] != -1){   
                            if(!visited[nr][nc]){
                                visited[nr][nc] = true;
                             q.add(new int[]{nr,nc,dis+1});
                             if(grid[nr][nc] == Integer.MAX_VALUE){
                                    grid[nr][nc] = dis +1;
                             }
                              
                            }            
                            
                        }
                    }
                }
    }
}
