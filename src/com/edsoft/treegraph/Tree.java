package com.edsoft.treegraph;

/**
 * Created by yusuf on 06.10.2016.
 */
public class Tree {
    private TreeNode root;

    public Tree(int data) {
        root = new TreeNode(data);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
