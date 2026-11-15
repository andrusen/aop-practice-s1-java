package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsTwoForFive() {
    assertThat(solution.findComplement(5)).isEqualTo(2);
  }

  @Test
  void returnsZeroForMinimalInput() {
    assertThat(solution.findComplement(1)).isZero();
  }

  @Test
  void returnsZeroForMaximalInteger() {
    assertThat(solution.findComplement(Integer.MAX_VALUE)).isZero();
  }

  @Test
  void flipsAllLowerBitsOfPowerOfTwo() {
    assertThat(solution.findComplement(1 << 30)).isEqualTo((1 << 30) - 1);
  }
}
