package BFS;

public class App {
    public static void main(String[] args){
        BreadthFirstSearch bfscall =  new BreadthFirstSearch();

        /* tree/graph
                1(root)
               / \
              2   3
             / \
            4   5
           /
          6
         */

        //creating nodes
        Vertex root = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);

        // adding neighbours
        root.addNeighbours(vertex3);
        root.addNeighbours(vertex2);
        vertex2.addNeighbours(vertex5);
        vertex2.addNeighbours(vertex4);
        vertex4.addNeighbours(vertex6);

        //calling bfs
        bfscall.bfs(root);
        System.out.println("");
        bfscall.bfs(vertex2);
    }
}
