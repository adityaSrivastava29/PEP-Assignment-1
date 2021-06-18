import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A class to store a Tree edge
class Edge
{
	int source, dest;

	public Edge(int source, int dest)
	{
		this.source = source;
		this.dest = dest;
	}
}


class Tree
{
	// A list of lists to represent an adjacency list
	List<List<Integer>> adjList = null;

	// Constructor
	Tree(List<Edge> edges, int N)
	{
		adjList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			adjList.add(new ArrayList<>());
		}

		
		for (Edge edge: edges)
		{
			int src = edge.source;
			int dest = edge.dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}

class TreeConstruct
{
	// Function to perform DFS traversal on the Tree on a Tree
	public static void DFS(Tree Tree, int v, boolean[] discovered)
	{
		// mark the current node as discovered
		discovered[v] = true;

		// print the current node
		System.out.print(v + " ");

		// do for every edge `v —> u`
		for (int u: Tree.adjList.get(v))
		{
			// if `u` is not yet discovered
			if (!discovered[u]) {
				DFS(Tree, u, discovered);
			}
		}
	}

	public static void main(String[] args)
	{
		// List of Tree edges as per the above diagram
		List<Edge> edges = Arrays.asList(
				// Notice that node 0 is unconnected
				new Edge(1, 2), new Edge(1, 7), new Edge(1, 8),
				new Edge(2, 3), new Edge(2, 6), new Edge(3, 4),
				new Edge(3, 5), new Edge(8, 9), new Edge(8, 12),
				new Edge(9, 10), new Edge(9, 11)
		);

        

		// total number of nodes in the Tree (0–12)
		final int N = 13;

		// build a Tree from the given edges
		Tree Tree = new Tree(edges, N);

		// to keep track of whether a vertex is discovered or not
		boolean[] discovered = new boolean[N];

		// Perform DFS traversal from all undiscovered nodes to
		// cover all unconnected components of a Tree
		for (int i = 0; i < N; i++)
		{
			if (!discovered[i]) {
				DFS(Tree, i, discovered);
			}
		}
	}
}
