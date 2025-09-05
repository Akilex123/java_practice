package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
      TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
        this.left = left;
         this.right = right;
     }
 }
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        if (leaves1.equals(leaves2)){
            return true;
        }
        return false;
    }
    private void dfs(TreeNode node, List<Integer> leaves){
        if (node == null) return;
        if (node.left == null && node.right == null){
            leaves.add(node.val);
        }
        dfs(node.left, leaves);
        dfs(node.right, leaves);

    }
}
