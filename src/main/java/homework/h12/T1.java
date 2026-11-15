package homework.h12;

// https://leetcode.com/problems/height-checker/
public class T1 {

  private static final int MAX_HEIGHT = 100;

  public int heightChecker(int[] heights) {
    int[] heightCounts = new int[MAX_HEIGHT + 1];
    for (int height : heights) {
      heightCounts[height]++;
    }

    int mismatches = 0;
    int expectedHeight = 1;

    for (int height : heights) {
      while (heightCounts[expectedHeight] == 0) {
        expectedHeight++;
      }

      if (height != expectedHeight) {
        mismatches++;
      }

      heightCounts[expectedHeight]--;
    }

    return mismatches;
  }
}
