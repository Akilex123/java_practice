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
    public int tribonacci(int n) {
        if (n<3) return n==0 ? 0:1;
        int a = 0;
        int b = 1;
        int c  = 1;
        int sum;
        for (int i = 3; i<=n; i++){
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
        }
        return c;
    }
}





