package Graph;

import Lists.UnorderedArray;
import Lists.UnorderedListADT;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class GraphNode<T> {

    protected T element;
    protected UnorderedListADT<GraphNode<T>> edgeList;

    /**
     * @param element
     */
    public GraphNode(T element) {
        this.element = element;
        this.edgeList = new UnorderedArray() {
        };
    }

    @Override
    public String toString() {
        String text = "Element: " + element + "";
        Iterator<GraphNode<T>> printItr = edgeList.iterator();
        while (printItr.hasNext()) {
            text += "\nEdge: " + element + "->" + printItr.next().element + "";
        }
        return text;
    }
}
