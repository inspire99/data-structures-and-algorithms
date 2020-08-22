package geeksforgeeks.graph;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * See documentation of this class code in your IDE, to visualize the graph being used in this problem
 * <img src="https://media.geeksforgeeks.org/wp-content/uploads/bfs-5.png" />
 *
 * Problem : https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * Useful article to understand BFS and DFS difference: https://techdifferences.com/difference-between-bfs-and-dfs.html
 */

public class BreadthFirstSearchGraph {


    // this needs to somehow store vertices and edges
    // we shall use adjacency list to store, let's use linkedlist

    int numVertices;

    LinkedList<Integer> adjacencyList[];

    public BreadthFirstSearchGraph(int p_numVertices) {
        numVertices = p_numVertices;
        // so, for visualization purpose, we are going to have a list of total number of vertices. one list to cover this.


        adjacencyList = new LinkedList[numVertices];
        // now comes the tricky part, if you have not understood adjacency list concept.
        // for each of this vertex, we are going to maintain another list of reachable vertices from this vertex.
        // so, 4 vertex means 4 lists, that's why we are doing the below initialization.

        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    // we need a function , to add edges to the graph
    public void addEdge(int a, int b) { // this will add an edge from a to b
        // the assumption is that, for the vertex a, already a linkedlist is created, which could hold b
        adjacencyList[a].add(b);
    }

    // for BFS, we are going to ultimately print out vertices reachable from the input vertex
    // since we are allowing 2 vertices to follow each other / directed edges,
    // we are going to create a boolean vector which will mark the visited vertex, to disallow
    // multiple visits to same vertex
    void BFS(int vertex) {

        boolean visited[] = new boolean[numVertices];
        visited[vertex] = true; // we are visited the input vertex initially, from there, we will go visit others

        // let's create a queue of vertices which we are able to visit from the vertex, starting with vertex
        // itself. Please note, for these kind of graph problems, it is always better to draw a graph and visualize
        // the problem.

        // we want a data structure to hold the vertices, so that we will iterate over each of these
        // vertices, to visit reachable vertices. for this, let's take a linkedlist
        LinkedList<Integer> queueOfVertices = new LinkedList();
        queueOfVertices.add(vertex);

        while (queueOfVertices.size() != 0) {

            Integer a_vertex = queueOfVertices.poll();
            // now we can print that, we have indeed reached this vertex within the graph.
            System.out.println(a_vertex);
            // get the adjacency list of this a_vertex, iterate over them and add them to queueOfVertices
            // apparently, for linkedlist, we have a different kind of iterator, which is listiterator
            ListIterator<Integer> adjacencyListIterator = adjacencyList[a_vertex].listIterator();

            // please note here, that we are taking 1st level neighbours of a vertex ( meaning directly reachable)
            // so, we are going breadth-wise.. taking one level at a time..
            // take a vertex, visit all its neighbours... then go to one neighbour, visit all its neighbours.. so on.


            // whereas in dfs, what we will do is: take a vertex, visit its neighbour.. go to that neighbour now itself.. visit its neighbour..
            // now move on to the next neighbour now only, visit its neighbour.. till dead-end.
            // then go back to the first vertex..

            // so, what we can realize that, in first vertex, it might have other multiple neighbours unvisited so far..
            // but in bfs, we just finish off visiting all neighbours of a vertex at one time, then go to its neighbours
            // and do it..



            while (adjacencyListIterator.hasNext()) {

                Integer reachableVertex = adjacencyListIterator.next();
                // now i have reached this vertex, so, let's mark that we have indeed visited it.
                // one point to note that, we might have already visited this vertex in the past, given
                // that directed edges are allowed in some types of graph ( directed graph, cyclic? )

                if (visited[reachableVertex] != true) {
                    //to disallow multiple visits to same vertex
                    visited[reachableVertex] = true;
                    queueOfVertices.add(reachableVertex);
                }

                // if you want to experiment something, see infinite loop in action, comment out
                // if block above.. you will realize importance of visited array.

            }


        }

    }


    public static void main(String[] args) {
        BreadthFirstSearchGraph g = new BreadthFirstSearchGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Search    " +
                "(starting from vertex 2)");

        g.BFS(2);
    }

    // if you want an analogy, take computer science explorers / software engineers

    // dfs:: some computer science explorers in life want to be experts in a particular branch, for example: networking
    // they go deeper into networking.. find its related concepts.. go deeper, till reaching a dead-end of researched areas.
    // after sometime, they might come back to visit other computer science topics.. this can be thought of depth first search

    // bfs:: for software engineers, (not all), we start with computer science..
    // visit its topics one at a time, during course of our career.
    // we dont go deep enough into one area. we touch multiple topics, in order to 'acquire' skills..
    // like: for eg: software engineering has: backend, front end, database, machine learning..
    // we might visit each of them , in order to 'acquire' these skills..
    // then later visit their related concepts.. ( this is a debatable analogy )

    // of course there are people who have T level ( breadth wise into multiple topics & depth into few topics )
}
