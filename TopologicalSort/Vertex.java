package TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private List<Vertex> adjacenciesList;

    public Vertex(String name){
        this.name = name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }

    public void addNeighbours(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }
    //setter
    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    //getter
    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
