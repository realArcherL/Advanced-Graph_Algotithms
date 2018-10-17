package TopologicalSort;

import java.util.Stack;

public class TopologicalOdering {
    private Stack<Vertex> stack;

    public TopologicalOdering(){
        this.stack = new Stack<>();
    }

    /***
     * Using a simple DFS recursive method and a stack to perform a Toplogical order
     * @param vertex
     * @author ArcherL
     */

    public void topologicalSortUsingDFS(Vertex vertex){

        vertex.setVisited(true);
        // stack.push(vertex);                           // to find the pre order.

        for (Vertex v: vertex.getAdjacenciesList()){
            if(!v.isVisited()){
                v.setVisited(true);
                topologicalSortUsingDFS(v);
            }
        }
        stack.push(vertex);                              // to find the post order.
    }

    public Stack<Vertex> getStack(){
        return this.stack;
    }
}
