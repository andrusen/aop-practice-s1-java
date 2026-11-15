package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void marksAllButOneKid() {
    assertThat(solution.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .containsExactly(true, true, true, false, true);
  }

  @Test
  void marksOnlyKidWithMostCandies() {
    assertThat(solution.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .containsExactly(true, false, false, false, false);
  }

  @Test
  void marksKidsTiedForMost() {
    assertThat(solution.kidsWithCandies(new int[] {12, 1, 12}, 10))
        .containsExactly(true, false, true);
  }

  @Test
  void handlesMinimalInput() {
    assertThat(solution.kidsWithCandies(new int[] {1, 1}, 1)).containsExactly(true, true);
  }

  @Test
  void handlesMaximalValues() {
    assertThat(solution.kidsWithCandies(new int[] {100, 1, 50}, 50))
        .containsExactly(true, false, true);
  }
}
