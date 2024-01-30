import java.util.ArrayList;
import java.util.PriorityQueue;

public class j126_Graphs_PrimsAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src=src;
            this.dest=dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[]graph){
        for(int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2, 3,50));

        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));

//        graph[4].add(new j40_Graphs_DijkstraAllgo.Edge(4,5,5));
//        graph[4].add(new j40_Graphs_DijkstraAllgo.Edge(4,3,2));
    }

    public static class Pair implements Comparable<Pair>{ // comparable is implemented bcz to tell the priority queue on which basis it has to prioritize
        int node;
        int dist;

        public Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist; // ascending
            // return p2.dist-this.dist  -> descending
        }
    }

    public static void primsAlgo(ArrayList<Edge>[]graph,int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // non - mst
        boolean[]vis = new boolean[V];
        pq.add(new Pair(0,0));

        int mstCost=0;

        while(!pq.isEmpty()){
            Pair curr=pq.remove();

            if(!vis[curr.node]){
                vis[curr.node]=true;
                mstCost+= curr.dist;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("Min dest is " +mstCost);
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

//        ?dijkstra(graph, 0,V);?
        primsAlgo(graph, V);
    }
}
