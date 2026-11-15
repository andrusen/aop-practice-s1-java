package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void fillsConnectedArea() {
    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

    assertThat(solution.floodFill(image, 1, 1, 2))
        .isDeepEqualTo(new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
  }

  @Test
  void keepsImageWhenColorIsSame() {
    int[][] image = {{0, 0, 0}, {0, 0, 0}};

    assertThat(solution.floodFill(image, 0, 0, 0))
        .isDeepEqualTo(new int[][] {{0, 0, 0}, {0, 0, 0}});
  }

  @Test
  void fillsSinglePixel() {
    assertThat(solution.floodFill(new int[][] {{0}}, 0, 0, 1)).isDeepEqualTo(new int[][] {{1}});
  }

  @Test
  void usesMaximalColor() {
    int maxColor = (1 << 16) - 1;

    assertThat(solution.floodFill(new int[][] {{0, 0}}, 0, 1, maxColor))
        .isDeepEqualTo(new int[][] {{maxColor, maxColor}});
  }

  @Test
  void fillsMaximalImage() {
    int[][] image = new int[50][50];
    int[][] expected = new int[50][50];
    for (int[] row : expected) {
      Arrays.fill(row, 7);
    }

    assertThat(solution.floodFill(image, 49, 49, 7)).isDeepEqualTo(expected);
  }
}
