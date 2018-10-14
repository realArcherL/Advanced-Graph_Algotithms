package BFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighboursList;

    public Vertex(int data){
        this.data = data;
        this.neighboursList = new ArrayList<>(); // to avoid null pointer exception
    }

    public void addNeighbours( Vertex vertex){
        this.neighboursList.add(vertex);
    }

    //setters visited
    public void setData(int data) {
        this.data = data;
    }
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    //geeters
    public int getData() {
        return data;
    }
    public boolean isVisited() {
        return visited;
    }
    public List<Vertex> getNeighboursList() {
        return neighboursList;
    }

    @Override
    public String toString(){
        return ""+this.data;
    }
}
