package Network;

import BinaryTree.BinaryTreeExceptions;
import Graph.GraphExceptions;
import Graph.GraphInLIst;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class NetworkList<T> extends GraphInLIst<T> implements NetworkADT<T> {

    @Override
    public void addEdge(T vertex1, T vertex2, double weight) throws GraphExceptions {


    }

    @Override
    public double shortestPathWeight(T vertex1, T vertex2) throws BinaryTreeExceptions, GraphExceptions {

        return 0;
    }

}
