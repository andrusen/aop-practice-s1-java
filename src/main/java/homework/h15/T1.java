package homework.h15;

// https://leetcode.com/problems/invert-binary-tree/
public class T1 {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertTree(root.left);
    invertTree(root.right);

    return root;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }
}
