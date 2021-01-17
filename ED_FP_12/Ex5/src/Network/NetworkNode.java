package Network;

import Graph.GraphNode;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class NetworkNode<T> extends GraphNode<T> {

    protected double weight;

    /**
     *
      * @param element
     * @param weight
     */
    public NetworkNode(T element, double weight) {
        super(element);
        this.weight = weight;
    }

}
