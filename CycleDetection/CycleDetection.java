package CycleDetection;

import java.util.List;

public class CycleDetection {
    /***
     * Using simple DFS to find cycleDetection
     * @param neighbourList
     * @author ArcherL
     */

    public void detectCycle(List<Vertex> neighbourList){
        for (Vertex v: neighbourList){
            if( !v.isIsvisited() ){
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex){

        vertex.setIsvisited(false);                 // to iterate now it is not yet visited
        vertex.setBeingvisited(true);               // now it is being visited

        for (Vertex v: vertex.getAdjacenciesList()) {

            // if checking for cycle.
            if ( v.isBeingvisited() ){
                System.out.println("Cycle Detected...at: "+v);
                return;
            }

            if (!v.isIsvisited()) {
                v.setIsvisited(true);
                dfs(v);
            }
        }

        vertex.setIsvisited(true);                  // now the vertex in dfs gets visited
        vertex.setBeingvisited(false);              // but cuurently not being visited
    }
}
