package com.erzhiqianyi.leecode.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTraversalIterativelyTest {

    @Test
    void preOrderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        PreOrderTraversalIteratively preOrderTraversalIteratively = new PreOrderTraversalIteratively();
        List<Integer> traversal =  preOrderTraversalIteratively.preOrderTraversal(root);
        traversal.stream().forEach(System.out::println);
    }
}