import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class j150_CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = numCourses;
        int m=prerequisites.length;
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m; i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }        

        int []indegree = new int[V];
        for(int i=0; i<V;i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<V; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo.add(node);
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        if(topo.size()==V) return true;
        return false;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int [][]prerequisites = {{1,0}};
        System.out.println(canFinish(numCourses, prerequisites));
    }
}
