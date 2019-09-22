package com.erzhiqianyi.leecode.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversaltrivialBetter {
    private List<Integer> traversal = new ArrayList<>();

    public List<Integer> preOrderTraversal(TreeNode root) {
        if (null == root) {
            return traversal;
        }
        traversal.add(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        return traversal;

    }
}
