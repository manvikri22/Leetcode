class Solution {
   public boolean isBipartite(int[][] graph) {

   int color[]=new int[graph.length];//for an unvisted graph-0
    //coloring graphs 1& -1 alternatively
    
    for(int i=0; i<graph.length; i++){
        if(color[i]==0){
            if(!dfs(graph,color,i,1))
                return false;
        }
        
    }
    return true;
}   
    public boolean dfs(int[][] graph,int color[], int i, int colors ){
        if(color[i]!=0)
            return color[i]==colors;
    
    color[i]=colors;
    
    for(int e: graph[i]){
        if(!dfs(graph,color,e,-colors))
            return false;
    }
  return true;
}
}