package DFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean isVisited;
    private List<Vertex>  adjacenciesList; // same as neighbours but more program friendly terminology
    private Vertex predecessor;

    public Vertex(String name){
        this.name = name;
        this.adjacenciesList = new ArrayList<>();  //to avoid null pointer exception
    }


    public void addAdjacencies(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }
    //getter

    public boolean isVisited() {
        return isVisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }


    //setter

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
