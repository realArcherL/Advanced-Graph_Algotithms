package WebCrawler;

import java.util.ArrayList;
import java.util.List;

/**
* practically not used in the class with the BFS and APP.java files
* @author ArcherL
*/
public class Vertex {
    private String name;
    private boolean isVisited;
    private Vertex previousVertex;
    private List<Vertex> adjacenciesList;

    public Vertex(String name){
        this.name = name;
        this.adjacenciesList= new ArrayList<Vertex>();  // to prevent null pointer exception
    }

    // setter methods except name and Adjacency list
    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }


    // getter methods
    public void addNeighbour(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    @Override
    public String toString() {
        return "Vertex{" + "name='" + name + '\'' + '}';
    }
}
