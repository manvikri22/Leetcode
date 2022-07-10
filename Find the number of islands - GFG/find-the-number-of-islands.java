// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int count = 0;
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j ++) {
                if(grid[i][j] == '1') {
                    count ++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid, int i, int j) {
        int n = grid.length, m = grid[0].length;
        if(i < 0 || j < 0 || i >= n || j >= m) {
            return;
        }
        if(grid[i][j] == '0') { 
            return;
        }
        grid[i][j] = '0';           // Mark as visited;
        dfs(grid, i - 1, j);        // north
        dfs(grid, i - 1, j - 1);    // north - west
        dfs(grid, i - 1, j + 1);    // north - east
        dfs(grid, i, j - 1);        // west
        dfs(grid, i, j + 1);        // east
        dfs(grid, i + 1, j - 1);    // south - west
        dfs(grid, i + 1, j + 1);    // south - east
        dfs(grid, i + 1, j);        // south
    }
}