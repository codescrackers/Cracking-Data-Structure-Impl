package com.edsoft.treegraph;

/**
 * Created by yusuf on 06.10.2016.
 */
public class GraphNode {

    private String name;
    private GraphNode[] nodes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GraphNode[] getNodes() {
        return nodes;
    }

    public void setNodes(GraphNode[] nodes) {
        this.nodes = nodes;
    }
}
