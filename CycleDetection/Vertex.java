package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isvisited;
    private boolean beingvisited;
    private List<Vertex> adjacenciesList;

    public Vertex(String name){
        this.name=name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }

    public void addNeighbours(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }

    // setter for booleans
    public void setIsvisited(boolean isvisited) {
        this.isvisited = isvisited;
    }

    public void setBeingvisited(boolean beingvisited) {
        this.beingvisited = beingvisited;
    }

    //getter
    public String getName() {
        return name;
    }

    public boolean isIsvisited() {
        return isvisited;
    }

    public boolean isBeingvisited() {
        return beingvisited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }
}
