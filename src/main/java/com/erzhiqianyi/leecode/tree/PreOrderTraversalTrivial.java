package com.erzhiqianyi.leecode.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalTrivial {
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (null == root) {
            return new ArrayList<>();
        }
        boolean rootNode = null != root.left || null != root.right;
        if (rootNode) {
            List<Integer> traversal = new ArrayList<>();
            traversal.add(root.val);
            if (null != root.left) {
                traversal.addAll(preOrderTraversal(root.left));
                if (null != root.right) {
                    traversal.addAll(preOrderTraversal(root.right));
                }
            } else if (null != root.right) {
                traversal.addAll(preOrderTraversal(root.right));
            }
            return traversal;
        } else {
            List<Integer> traversal = new ArrayList<>();
            traversal.add(root.val);
            return traversal;
        }
    }
}
