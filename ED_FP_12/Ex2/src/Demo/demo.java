package Demo;

import java.util.Iterator;

import Graph.GraphADT;
import Graph.GraphExceptions;
import Graph.GraphInLIst;
import Stack.EmptyCollectionException;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class demo {

    public static void tests(int test) throws GraphExceptions, EmptyCollectionException {
        GraphADT<Integer> graph;
        Iterator<Integer> itr;

        switch (test) {
            // Add Test
            case 1:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(1, 4);
                System.out.println(graph.toString());
                break;
            //ShortestPath Not Found Test
            case 2:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(1, 4);
                Iterator itrSP = graph.iteratorShortestPath(1, 3);
                while (itrSP.hasNext()) {
                    System.out.print("->");
                    System.out.print(itrSP.next());
                }
                System.out.println("");
                break;
            //ShortestPath Found Test
            case 3:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(1, 4);
                Iterator itrSPFound = graph.iteratorShortestPath(1, 4);
                while (itrSPFound.hasNext()) {
                    System.out.print("->");
                    System.out.print(itrSPFound.next());
                }
                System.out.println("");
                break;
            // Remove Test
            case 4:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 3);
                graph.addEdge(3, 1);
                graph.addEdge(3, 3);
                graph.addEdge(4, 4);
                graph.addEdge(1, 4);
                System.out.println(graph.toString());
                graph.removeVertex(3);
                System.out.println(graph.toString());
                break;
            // BFS Itr Test
            case 5:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(2, 3);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(1, 4);
                System.out.println(graph.toString());
                itr = graph.iteratorBFS(1);
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            // Connected Test
            case 6:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(4, 3);
                graph.addEdge(1, 4);
                System.out.println(graph.toString());
                System.out.println("\nExcepted: True. Result : " + graph.isConnected());
                break;
            //Remove Edge Test
            case 7:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 4);
                graph.addEdge(2, 2);
                graph.addEdge(1, 1);
                graph.addEdge(4, 4);
                graph.addEdge(4, 3);
                graph.addEdge(1, 4);
                System.out.println(graph.toString());
                graph.removeEdge(1, 4);
                System.out.println(graph.toString());
                break;
            // DFS Itr Test
            case 8:
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addEdge(1, 2);
                graph.addEdge(2, 3);
                graph.addEdge(3, 4);
                graph.addEdge(1, 4);
                graph.addEdge(4, 2);
                System.out.println(graph.toString());
                itr = graph.iteratorDFS(4);
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 9://shortest path
                graph = new GraphInLIst<>();
                graph.addVertex(1);
                graph.addVertex(2);
                graph.addVertex(3);
                graph.addVertex(4);
                graph.addVertex(5);
                graph.addVertex(6);
                graph.addEdge(1, 2);
                graph.addEdge(1, 3);
                graph.addEdge(1, 4);
                graph.addEdge(3, 6);
                graph.addEdge(4, 5);
                //graph.addEdge(4, 6); //descomentar para ter um path do mesmo tamanho de 1-3-6, ficaria 1-4-6
                graph.addEdge(2, 5);
                graph.addEdge(5, 6);
                System.out.println(graph.toString());
                itr = graph.iteratorShortestPath(1,6);
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) throws GraphExceptions, EmptyCollectionException {
        System.out.println("----------------------------------");
        for (int i = 1; i <= 9; ++i){
            tests(i);
            System.out.println("----------------------------------");
        }
    }
}