package leetcode.problems;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other,
 *
 * some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 *
 * then sum node values up as the new value of the merged node.
 *
 * Otherwise, the NOT null node will be used as the node of new tree.
 *
 * Example 1:
 * Input:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * Output:
 * Merged tree:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 * Note: The merging process must start from the root nodes of both trees.
 */
public class MergeTwoBinaryTree {

    public class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode (int val){
            this.val = val;
        }
    }

    public TreeNode merge(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return null;
        } else {
            if (tree1 != null && tree2 != null) {
                TreeNode resultTree = new TreeNode(tree1.val + tree2.val);
                resultTree.left = merge(tree1.left, tree2.left);
                resultTree.right = merge(tree1.right, tree2.right);
                return resultTree;
            } else {
                if (tree1 == null && tree2 != null) {
                    return tree2;
                } else {
                    if (tree1 != null && tree2 == null) {
                        return tree1;
                    }
                }
            }
        }
        return null;
    }

    public void mergeTree(){
        TreeNode sourceTreeRoot = new TreeNode(1);
        TreeNode sourceLeft1 = new TreeNode(3);
        TreeNode sourceright1 = new TreeNode(2);
        TreeNode sourceLeft2 = new TreeNode(5);
        sourceTreeRoot.left = sourceLeft1;
        sourceTreeRoot.right = sourceright1;
        sourceLeft1.left = sourceLeft2;

        TreeNode targetTreeRoot = new TreeNode(2);
        TreeNode targetLeft1 = new TreeNode(1);
        TreeNode targetRight1 = new TreeNode(3);
        TreeNode targetRight11 = new TreeNode(4);
        TreeNode targetRight21 = new TreeNode(7);
        targetTreeRoot.left = targetLeft1;
        targetTreeRoot.right = targetRight1;
        targetLeft1.right = targetRight11;
        targetRight1.right = targetRight21;

        TreeNode resultTree = merge(sourceTreeRoot, targetTreeRoot);
        System.out.println(resultTree.val);
    }

    public static void main(String[] args) {
        MergeTwoBinaryTree mergeTree = new MergeTwoBinaryTree();
        mergeTree.mergeTree();
    }

}
