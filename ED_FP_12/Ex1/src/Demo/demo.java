package Demo;

import Graph.GraphInMatrix;

import java.util.Iterator;

import Graph.GraphExceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class demo {

    public static void tests(int test) throws GraphExceptions {
        GraphInMatrix<Integer> graphInMatrix;
        Iterator<Integer> itr;

        switch (test) {
            // Add Test
            case 1:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                System.out.println(graphInMatrix.toString());
                break;
            //ShortestPath Not Found Test
            case 2:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                Iterator itrSP = graphInMatrix.iteratorShortestPath(1, 3);
                while (itrSP.hasNext()) {
                    System.out.print("->");
                    System.out.print(itrSP.next());
                }
                System.out.println("");
                break;
            //ShortestPath Found Test
            case 3:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                Iterator itrSPFound = graphInMatrix.iteratorShortestPath(1, 4);
                while (itrSPFound.hasNext()) {
                    System.out.print("->");
                    System.out.print(itrSPFound.next());
                }
                System.out.println("");
                break;
            // Remove Test
            case 4:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                System.out.println(graphInMatrix.toString());
                graphInMatrix.removeVertex(3);
                System.out.println(graphInMatrix.toString());
                // BFS Itr Test
            case 5:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                System.out.println(graphInMatrix.toString());
                itr = graphInMatrix.iteratorBFS(1);
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            // Connected Test
            case 6:
                graphInMatrix = new GraphInMatrix();
                graphInMatrix.addVertex(1);
                graphInMatrix.addVertex(2);
                graphInMatrix.addVertex(3);
                graphInMatrix.addVertex(4);
                graphInMatrix.addEdge(1, 2);
                graphInMatrix.addEdge(2, 4);
                graphInMatrix.addEdge(2, 2);
                graphInMatrix.addEdge(1, 1);
                graphInMatrix.addEdge(4, 3);
                graphInMatrix.addEdge(4, 4);
                graphInMatrix.addEdge(1, 4);
                System.out.println(graphInMatrix.toString());
                System.out.println("\nExcepted: True. Result : " + graphInMatrix.isConnected());
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) throws GraphExceptions {
        System.out.println("----------------------------------");
        for (int i = 1; i <= 6; ++i){
            tests(i);
            System.out.println("----------------------------------");
        }
    }
}
