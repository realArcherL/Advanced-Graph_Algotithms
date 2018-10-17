package TopologicalSort;

public class App {

    public static void main(String[] args){
        TopologicalOdering tgo = new TopologicalOdering();

        Vertex vertexa = new Vertex("A");
        Vertex vertexb= new Vertex("B");
        Vertex vertexc = new Vertex("C");
        Vertex vertexd = new Vertex("D");
        Vertex vertexe = new Vertex("E");

        /*
               A-->B-->C-->D-->E
               A-->B-->D
         */

        vertexa.addNeighbours(vertexc);
        vertexa.addNeighbours(vertexb);

        vertexb.addNeighbours(vertexc);
        vertexb.addNeighbours(vertexd);

        vertexc.addNeighbours(vertexd);

        vertexd.addNeighbours(vertexe);


        tgo.topologicalSortUsingDFS(vertexa);

        for (Vertex ver: tgo.getStack()) {
            System.out.print(ver+" ");
        }
    }
}
