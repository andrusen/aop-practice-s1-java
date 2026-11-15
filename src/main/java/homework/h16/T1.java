package homework.h16;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/flood-fill/
public class T1 {

  private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int originalColor = image[sr][sc];
    if (originalColor == color) {
      return image;
    }

    int rows = image.length;
    int cols = image[0].length;

    Queue<int[]> queue = new ArrayDeque<>();
    queue.offer(new int[] {sr, sc});
    image[sr][sc] = color;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();

      for (int[] direction : DIRECTIONS) {
        int row = current[0] + direction[0];
        int col = current[1] + direction[1];

        if (row >= 0 && row < rows && col >= 0 && col < cols && image[row][col] == originalColor) {
          image[row][col] = color;
          queue.offer(new int[] {row, col});
        }
      }
    }

    return image;
  }
}
