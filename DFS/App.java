package DFS;

public class App {
    public static void main(String[] args){

        DepthFirstSearch dfsCall = new DepthFirstSearch();

        /*
                N
               / \
              A   I
             / \ / \
            T  N S  H
         */
        Vertex root = new Vertex("N");
        Vertex vertexi = new Vertex("I");
        Vertex vertexs = new Vertex("S");
        Vertex vertexh = new Vertex("H");
        Vertex vertexa = new Vertex("A");
        Vertex vertexn = new Vertex("N");
        Vertex vertext = new Vertex("T");

        root.addAdjacencies(vertexi);
        root.addAdjacencies(vertexa);

        vertexa.addAdjacencies(vertexn);
        vertexa.addAdjacencies(vertext);

        vertexi.addAdjacencies(vertexh);
        vertexi.addAdjacencies(vertexs);

        dfsCall.DFS(root);
    }
}
