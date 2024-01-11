import java.util.ArrayList;
import java.util.List;

class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Computer extends Node {
    public Computer(String name) {
        super(name);
    }
}

class Edge {
    private Node node1;
    private Node node2;

    public Edge(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
    }

    @Override
    public String toString() {
        return node1 + " -> " + node2;
    }
}

class Network {
    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    @Override
    public String toString() {
        return "Network{nodes=" + nodes + ", edges=" + edges + '}';
    }
}

class SimpleNetworkTopology {

    public static void main(String[] args) {
        // Create nodes
        Node router = new Node("Router");
        Node switchNode = new Node("Switch");
        Computer computer1 = new Computer("Computer1");
        Computer computer2 = new Computer("Computer2");

        // Create edges
        Edge edge1 = new Edge(router, switchNode);
        Edge edge2 = new Edge(switchNode, computer1);
        Edge edge3 = new Edge(switchNode, computer2);

        // Create a network
        Network network = new Network();

        // Add nodes and edges to the network
        network.addNode(router);
        network.addNode(switchNode);
        network.addNode(computer1);
        network.addNode(computer2);

        network.addEdge(edge1);
        network.addEdge(edge2);
        network.addEdge(edge3);

        // Display the network
        System.out.println(network);
    }
}
