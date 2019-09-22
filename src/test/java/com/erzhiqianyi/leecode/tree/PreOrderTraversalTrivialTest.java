package com.erzhiqianyi.leecode.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

class PreOrderTraversalTrivialTest {

    @Test
    void preOrderTraversal() {
        TreeNode root = new TreeNode(3);
        TreeNode rootRight = new TreeNode(2);
        TreeNode rootLeft = new TreeNode(1);
        root.left = rootLeft;
        root.right = rootRight;
        rootRight.left = new TreeNode(4);
        rootRight.right = new TreeNode(5);
        rootLeft.left = new TreeNode(6);
        rootLeft.left.left = new TreeNode(7);
        PreOrderTraversalTrivial orderTraversal = new PreOrderTraversalTrivial();
        PreOrderTraversaltrivialBetter preOrderTraversaltrivialBetter = new PreOrderTraversaltrivialBetter();
        List<Integer> traversal = orderTraversal.preOrderTraversal(root);
        traversal.forEach(System.out::println);
        traversal = preOrderTraversaltrivialBetter.preOrderTraversal(root) ;
        traversal.forEach(System.out::println);

    }
}