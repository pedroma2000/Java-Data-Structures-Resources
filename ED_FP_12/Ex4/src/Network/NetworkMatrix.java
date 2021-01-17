package Network;

import BinaryTree.BinaryTreeExceptions;
import Graph.GraphExceptions;
import Graph.GraphInMatrix;
import Lists.UnorderedArray;
import Lists.UnorderedListADT;
import PriorityQueue.*;

/**
 * @param <T>
 *
 * @author Pedro Machado "pedroma2000"
 */
public class NetworkMatrix<T> extends GraphInMatrix<T> implements NetworkADT<T> {

    protected double[][] weightMatrix;

    public NetworkMatrix() {
        this.weightMatrix = new double[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
    }


    @Override
    public void addVertex(T vertex) {
        if (numVertices == vertices.length) {
            expandCapacity();
        }

        vertices[numVertices] = vertex;
        for (int i = 0; i < adjMatrix.length; i++) {
            adjMatrix[numVertices][i] = false;
            adjMatrix[i][numVertices] = false;
        }
        numVertices++;
    }

    /**
     *
     */
    private void expandCapacity() {
        T[] tmp = (T[]) (new Object[vertices.length + DEFAULT_CAPACITY]);
        for (int i = 0; i < vertices.length; i++) {
            tmp[i] = vertices[i];
        }

        vertices = tmp;

        boolean[][] tmp_mat = new boolean[tmp.length][tmp.length];
        for (int j = 0; j < adjMatrix.length; j++) {
            for (int k = 0; k < adjMatrix.length; k++) {
                tmp_mat[j][k] = adjMatrix[j][k];
            }
        }

        adjMatrix = tmp_mat;

        double[][] tmp_Wmat = new double[tmp.length][tmp.length];
        for (int j = 0; j < weightMatrix.length; j++) {
            for (int k = 0; k < weightMatrix.length; k++) {
                tmp_Wmat[j][k] = weightMatrix[j][k];
            }
        }

        weightMatrix = tmp_Wmat;
    }

    @Override
    public void removeVertex(T vertex) throws GraphExceptions {

        if (isEmpty()) {
            throw new GraphExceptions(GraphExceptions.EMPTY_GRAPH);
        }

        int index = getIndex(vertex);

        if (index == -1) {
            throw new GraphExceptions(GraphExceptions.ELEMENT_NOT_FOUND);
        }

        for (int i = index; i < numVertices - 1; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjMatrix[j][i] = adjMatrix[j][i + 1];
                weightMatrix[j][i] = weightMatrix[j][i + 1];
            }

        }

        for (int i = index; i < numVertices - 1; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjMatrix[i][j] = adjMatrix[i + 1][j];
                weightMatrix[i][j] = weightMatrix[i + 1][j];
            }

        }

        for (int h = index; h < numVertices - 1; h++) {
            vertices[h] = vertices[h + 1];
        }

        numVertices--;

    }

    @Override
    public void addEdge(T vertex1, T vertex2, double weight) throws GraphExceptions {
        int indexVertex1 = getIndex(vertex1);
        int indexVertex2 = getIndex(vertex2);

        if (indexIsValid(indexVertex1) && indexIsValid(indexVertex2)) {
            addEdge(vertex1, vertex2);
            weightMatrix[indexVertex1][indexVertex2] = weight;
            weightMatrix[indexVertex2][indexVertex1] = weight;
        } else {
            throw new GraphExceptions(GraphExceptions.ELEMENT_NOT_FOUND);
        }
    }

    private Pair<T> findLastPairInShortestPair(T startVertex, T targetVertex) throws BinaryTreeExceptions, GraphExceptions {
        PriorityQueue<Pair<T>> priorityQueue = new PriorityQueue<Pair<T>>();
        UnorderedListADT<T> verticesInPath = new UnorderedArray<>();
        Pair<T> startPair = new Pair<>(null, startVertex, 0.0);

        priorityQueue.addElement(startPair, (int) startPair.cost);

        while (!priorityQueue.isEmpty()) {
            Pair<T> pair = priorityQueue.removeNext();
            T vertex = pair.vertex;
            double minCostToVertex = pair.cost;

            if (vertex.equals(targetVertex)) {
                return pair;
            }

            verticesInPath.addToRear(vertex);

            for (int i = 0; i < numVertices; ++i) {
                if (adjMatrix[getIndex(vertex)][i] && !verticesInPath.contains(vertices[i])) {
                    double minCostToI = minCostToVertex + weightMatrix[getIndex(vertex)][i];
                    Pair<T> tmpPair = new Pair<>(pair, vertices[i], minCostToI);
                    priorityQueue.addElement(tmpPair, (int) tmpPair.cost);
                }
            }
        }

        throw new GraphExceptions(GraphExceptions.PATH_NOT_FOUND);
    }

    @Override
    public double shortestPathWeight(T vertex1, T vertex2) throws BinaryTreeExceptions, GraphExceptions {
        if (!indexIsValid(getIndex(vertex1))) {
            throw new GraphExceptions(GraphExceptions.ELEMENT_NOT_FOUND);
        }

        return findLastPairInShortestPair(vertex1, vertex2).cost;
    }


    @Override
    public String toString() {
        String text = "";

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                text += "|";
                text += weightMatrix[i][j];
                text += "|";
            }
            text += "\n";
        }

        return text;
    }

}
