class Solution {
    public boolean isBipartite(int[][] g) {
        int[] colors = new int[g.length];
        for (int i = 0; i < g.length; i++)
            if (colors[i] == 0) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                colors[i] = 1;
                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    for (int adjacent : g[node])
                        if (colors[adjacent] == colors[node])
                            return false;
                        else if (colors[adjacent] == 0) {
                            q.add(adjacent);
                            colors[adjacent] = -colors[node];
                        }
                }
            }
        return true;
    }
   /** public boolean check(int[][] adj,int node, int[] color)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node]=1;
        while(!q.isEmpty())
        {
            Integer nde = q.poll();
                for(int it: adj[nde] )
                {
                    if(color[it]==-1)
                    {
                        color[it] = 1- color[nde];
                        q.add(it);
                    }
                    else if(color[it]==color[nde])
                    {
                        return false;
                    }
                }
        }
        return true;
    **/
}