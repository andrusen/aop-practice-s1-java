package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T2.TreeNode;
import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void sumsValuesBetweenSevenAndFifteen() {
    TreeNode root = buildTree(10, 5, 15, 3, 7, null, 18);

    assertThat(solution.rangeSumBST(root, 7, 15)).isEqualTo(32);
  }

  @Test
  void sumsValuesBetweenSixAndTen() {
    TreeNode root = buildTree(10, 5, 15, 3, 7, 13, 18, 1, null, 6);

    assertThat(solution.rangeSumBST(root, 6, 10)).isEqualTo(23);
  }

  @Test
  void returnsSingleNodeInsideRange() {
    assertThat(solution.rangeSumBST(buildTree(5), 5, 5)).isEqualTo(5);
  }

  @Test
  void returnsZeroWhenNothingInRange() {
    assertThat(solution.rangeSumBST(buildTree(5, 3, 8), 6, 7)).isZero();
  }

  @Test
  void handlesMinimalAndMaximalBounds() {
    TreeNode root = buildTree(50_000, 1, 100_000);

    assertThat(solution.rangeSumBST(root, 1, 100_000)).isEqualTo(150_001);
  }

  private static TreeNode buildTree(Integer... values) {
    TreeNode root = new TreeNode(values[0]);
    Queue<TreeNode> parents = new ArrayDeque<>();
    parents.add(root);
    int index = 1;

    while (index < values.length) {
      TreeNode parent = parents.poll();
      if (values[index] != null) {
        parent.left = new TreeNode(values[index]);
        parents.add(parent.left);
      }
      index++;
      if (index < values.length && values[index] != null) {
        parent.right = new TreeNode(values[index]);
        parents.add(parent.right);
      }
      index++;
    }

    return root;
  }
}
