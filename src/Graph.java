
public class Graph {
	public Node[] nodes;
	public Node[] getNodes() {
		return nodes;
	}
}

class Node {
	public String name;
	private Node[] children;
	public String state;
	public Node[] getAdjacent() {
		return children;
	}
}