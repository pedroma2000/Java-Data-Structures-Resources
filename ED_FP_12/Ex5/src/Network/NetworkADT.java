package Network;

import BinaryTree.BinaryTreeExceptions;
import Graph.GraphADT;
import Graph.GraphExceptions;

/**
 * NetworkADT defines the interface to a network.
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface NetworkADT<T> extends GraphADT<T> {

    /**
     * Inserts an edge between two vertices of this graph.
     * @param vertex1   the first vertex
     * @param vertex2   the second vertex
     * @param weight    the weight
     */
    public void addEdge(T vertex1, T vertex2, double weight) throws GraphExceptions;

    /**
     * Returns the weight of the shortest path in this network.
     *
     * @param vertex1   the first vertex
     * @param vertex2   the second vertex
     * @return          the weight of the shortest path in this network
     */
    public double shortestPathWeight(T vertex1, T vertex2) throws BinaryTreeExceptions, GraphExceptions;
}
