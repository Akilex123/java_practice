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
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int [nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i=1; i<nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        right[nums.length - 1] = 1;
        for (int i=nums.length-2; i>-1; i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}





