package chapter8.lesson1;

import chapter8.lesson1.Edge;

interface WeightedGraph<Weight extends Number & Comparable> {
    public int V();
    public int E();
    public void addEdge(Edge<Weight> e);
    boolean hasEdge(int v, int w);
    void show();
    public Iterable<Edge<Weight>> adj(int v);
}
