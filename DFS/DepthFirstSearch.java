package DFS;

import java.util.Stack;

public class DepthFirstSearch {

    private Stack<Vertex> stack;

    public DepthFirstSearch(){
        this.stack = new Stack<>();
    }

    /**
     * Using a simple Stack to traverse in the graph deep using DFS
     * @param root
     * @author ArcherL
     */

    public void DFS(Vertex root){

        stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.print(actualVertex+"--");

            for (Vertex v: actualVertex.getAdjacenciesList()){
                if (!v.isVisited()){
                        v.setVisited(true);
                        v.setPredecessor(actualVertex);
                        stack.push(v);
                }
            }
        }
    }
    // more rhobust and Faster than the previous
    public void DFSRecursion(Vertex root){

        System.out.print(root+"-");

        for (Vertex v: root.getAdjacenciesList()){
            if(!v.isVisited()){
                v.setVisited(true);
                v.setPredecessor(v);
                DFSRecursion(v);
            }
        }
    }
}
