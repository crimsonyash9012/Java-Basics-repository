import java.util.LinkedList;
import java.util.Queue;

public class j149_NumberOfIslands {
    static class pair{
        int first;
        int second;

        public pair(int first, int second){
            this.first=first;
            this.second=second;
        }
    }


    private static void bfs(int r, int c,int [][] vis, char[][]grid ){
        vis[r][c] = 1;

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(r,c));
        
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            int dirRow [] = {-1,0,1,0};
            int dirCol [] = {0,1,0,-1};

            for(int i=0; i<4; i++){
                int nrow=row+dirRow[i];
                int ncol=col+dirCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new pair(nrow,ncol));
                }

            }

            // for(int delRow=-1; delRow<=1; delRow++){
            //     for(int delCol=-1; delCol<=1; delCol++){
            //         int nrow=row+delRow;
            //         int ncol=col+delCol;

            //         if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
            //             vis[nrow][ncol]=1;
            //             q.add(new pair(nrow,ncol));
            //         }
            //     }
            // }
        }
    }

    public static int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int vis[][] = new int[n][m];
        int cnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        char[][] grid = {
           {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println(numIslands(grid));
    }
}


