package com.edsoft.treegraph;

/**
 * Created by yusuf on 06.10.2016.
 */
public class App {
    public static void main(String[] args) {
        Tree tree = initTree();

        inOrder(tree.getRoot());
    }

    private static Tree initTree() {
        Tree tree = new Tree(1);
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(8);
        treeNode1.setChildren(new TreeNode[]{treeNode2});
        tree.getRoot().setChildren(new TreeNode[]{treeNode, treeNode1});
        return tree;
    }

    private static void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node);
            System.out.println(node.getData());
            inOrder(node);
        }
    }
}
