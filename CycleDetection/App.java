package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        Vertex vertexa = new Vertex("A");
        Vertex vertexb= new Vertex("B");
        Vertex vertexc = new Vertex("C");
        Vertex vertexd = new Vertex("D");
        Vertex vertexe = new Vertex("E");

        /*             C-->A
               A-->B-->C-->D-->E
               A-->B-->D
         */

        vertexa.addNeighbours(vertexc);
        vertexa.addNeighbours(vertexb);

        vertexb.addNeighbours(vertexc);
        vertexb.addNeighbours(vertexd);

        vertexc.addNeighbours(vertexd);
        vertexc.addNeighbours(vertexa);

        vertexd.addNeighbours(vertexe);

        List<Vertex> vertexList = new ArrayList<Vertex>();
        vertexList.add(vertexa);
        vertexList.add(vertexb);
        vertexList.add(vertexc);
        vertexList.add(vertexd);
        vertexList.add(vertexe);


        CycleDetection cd = new CycleDetection();
        cd.detectCycle(vertexList);

    }
}
