package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void reducesThirtyEightToTwo() {
    assertThat(solution.addDigits(38)).isEqualTo(2);
  }

  @Test
  void returnsZeroForZero() {
    assertThat(solution.addDigits(0)).isZero();
  }

  @Test
  void returnsNineForMultipleOfNine() {
    assertThat(solution.addDigits(18)).isEqualTo(9);
  }

  @Test
  void returnsSingleDigitItself() {
    assertThat(solution.addDigits(7)).isEqualTo(7);
  }

  @Test
  void reducesMaximalIntegerToOne() {
    assertThat(solution.addDigits(Integer.MAX_VALUE)).isEqualTo(1);
  }
}
