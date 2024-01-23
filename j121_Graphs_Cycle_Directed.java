import java.util.ArrayList;

public class j121_Graphs_Cycle_Directed {
    static class Edge { // for weighted graph edge => add -> int weight;
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }

    public static boolean isCycleDirected(ArrayList<Edge> []graph, boolean[] vis,int curr, boolean []rec ){
        vis[curr]=true;
        rec[curr]=true;

        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            } else if (!vis[e.dest]) {
                if(isCycleDirected(graph, vis, e.dest, rec)){
                    return true;
                }
            }
        }

        rec[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> [] graph = new ArrayList[V];
        createGraph(graph);

        // all below is bcz we want only 1 cycle and the graph could have multiple cycles in it

        boolean [] vis = new boolean[V];
        boolean [] rec = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                boolean isCycle = isCycleDirected(graph, vis, 0, rec);

                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
//                System.out.println(isCycleDirected(graph,vis,0,rec));
            }
        }



        /*for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }*/

    }
}
