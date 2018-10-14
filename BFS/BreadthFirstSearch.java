package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch{

    /** making a constructor to run the program
     * making a queue to store the actual vertexes
     * @param root
     * @author ArcherL
     */

    public void bfs(Vertex root){

        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);

        ((LinkedList<Vertex>) queue).add(root);

        while(!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            System.out.print(actualVertex+"--");

            for(Vertex v: actualVertex.getNeighboursList()){
                if(!v.isVisited())
                    v.setVisited(true);
                    ((LinkedList<Vertex>) queue).add(v);
            }
        }
    }
}
