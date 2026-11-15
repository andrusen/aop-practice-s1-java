package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void sortsSquaresOfMixedNumbersWithZero() {
    assertThat(solution.sortedSquares(new int[] {-4, -1, 0, 3, 10}))
        .containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void sortsSquaresWithDuplicates() {
    assertThat(solution.sortedSquares(new int[] {-7, -3, 2, 3, 11}))
        .containsExactly(4, 9, 9, 49, 121);
  }

  @Test
  void squaresSingleMinimalElement() {
    assertThat(solution.sortedSquares(new int[] {-10_000})).containsExactly(100_000_000);
  }

  @Test
  void squaresBoundaryValues() {
    assertThat(solution.sortedSquares(new int[] {-10_000, 10_000}))
        .containsExactly(100_000_000, 100_000_000);
  }

  @Test
  void keepsOrderForNegativeOnlyInput() {
    assertThat(solution.sortedSquares(new int[] {-3, -2, -1})).containsExactly(1, 4, 9);
  }
}
