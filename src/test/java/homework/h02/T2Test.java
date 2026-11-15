package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void keepsNumberWithoutTrailingZeros() {
    assertThat(solution.isSameAfterReversals(526)).isTrue();
  }

  @Test
  void losesTrailingZeros() {
    assertThat(solution.isSameAfterReversals(1800)).isFalse();
  }

  @Test
  void keepsZero() {
    assertThat(solution.isSameAfterReversals(0)).isTrue();
  }

  @Test
  void losesTrailingZerosOfMaximalInput() {
    assertThat(solution.isSameAfterReversals(1_000_000)).isFalse();
  }

  @Test
  void keepsSingleDigit() {
    assertThat(solution.isSameAfterReversals(9)).isTrue();
  }
}
