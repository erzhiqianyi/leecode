package com.erzhiqianyi.leecode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIteratively {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        Stack<TreeNode> sta = new Stack<>();
        TreeNode current = root;
        while (!sta.isEmpty() || current != null) {
            if (current != null) {
                traversal.add(current.val);
                sta.add(current);
                current = current.left;
            } else {
                current = sta.pop();
                current = current.right;
            }
        }
        return traversal;
    }


}
