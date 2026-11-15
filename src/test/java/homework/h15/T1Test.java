package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import homework.h15.T1.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void invertsSevenNodeTree() {
    TreeNode root = buildTree(4, 2, 7, 1, 3, 6, 9);

    assertThat(toLevelOrder(solution.invertTree(root))).containsExactly(4, 7, 2, 9, 6, 3, 1);
  }

  @Test
  void invertsThreeNodeTree() {
    TreeNode root = buildTree(2, 1, 3);

    assertThat(toLevelOrder(solution.invertTree(root))).containsExactly(2, 3, 1);
  }

  @Test
  void returnsNullForEmptyTree() {
    assertThat(solution.invertTree(null)).isNull();
  }

  @Test
  void keepsSingleNode() {
    TreeNode root = buildTree(-100);

    assertThat(toLevelOrder(solution.invertTree(root))).containsExactly(-100);
  }

  @Test
  void movesOnlyChildToOtherSide() {
    TreeNode root = buildTree(1, 2, null);

    assertThat(toLevelOrder(solution.invertTree(root))).containsExactly(1, null, 2);
  }

  @Test
  void handlesMaximalNodeCount() {
    Integer[] values = IntStream.rangeClosed(1, 100).boxed().toArray(Integer[]::new);

    assertThat(toLevelOrder(solution.invertTree(buildTree(values))))
        .filteredOn(Objects::nonNull)
        .hasSize(100)
        .startsWith(1, 3, 2, 7, 6, 5, 4);
  }

  private static TreeNode buildTree(Integer... values) {
    if (values.length == 0) {
      return null;
    }

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

  private static List<Integer> toLevelOrder(TreeNode root) {
    List<Integer> values = new ArrayList<>();
    List<TreeNode> level = new ArrayList<>();
    level.add(root);

    for (int i = 0; i < level.size(); i++) {
      TreeNode node = level.get(i);
      if (node == null) {
        values.add(null);
      } else {
        values.add(node.val);
        level.add(node.left);
        level.add(node.right);
      }
    }

    while (!values.isEmpty() && values.getLast() == null) {
      values.removeLast();
    }
    return values;
  }
}
