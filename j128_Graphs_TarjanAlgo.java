import java.util.ArrayList;

public class j128_Graphs_TarjanAlgo {
    static class Edge{
        int s;
        int d;

        Edge(int s, int d){
            this.s=s;
            this.d=d;

        }
    }

    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge>[]graph, int curr, boolean[]vis,int []dt, int[]low,int time,int par){
        vis[curr]=true;
        dt[curr]=low[curr]=++time;

        for(int i = 0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(e.d==par){
                continue;
            }
            else if (!vis[e.d]) {
                dfs(graph,e.d,vis,dt,low,time,curr);
                low[curr] = Math.min(low[curr], low[e.d]);
                if(dt[curr]<low[e.d]){
                    System.out.println(curr + "-----" + e.d);
                }
            }
            else{
                low[curr] = Math.min(low[curr], dt[e.d]);
            }
        }
    }

    public static void getBridge(ArrayList<Edge>[]graph,int V){
        int[] dt =new int[V];
        int[] low =new int[V];
        int time=0;

        boolean[] vis=new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph,i,vis,dt,low,time,-1);
            }

        }
    }

    public static void main(String[] args) {
        int V=6;

        ArrayList<Edge> [] graph=new ArrayList[V];
        /*for(int i=0; i<V; i++){

        }*/
        createGraph(graph);
        getBridge(graph,V);

    }    
}
