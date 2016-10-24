package com.edsoft.treegraph;

/**
 * Created by yusuf on 06.10.2016.
 */
public class TreeNode {
    private int data;
    private TreeNode[] children;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode[] getChildren() {
        return children;
    }

    public void setChildren(TreeNode[] children) {
        this.children = children;
    }
}
