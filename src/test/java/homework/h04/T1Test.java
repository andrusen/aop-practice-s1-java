package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsTwoForOneAndFour() {
    assertThat(solution.hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void returnsOneForThreeAndOne() {
    assertThat(solution.hammingDistance(3, 1)).isEqualTo(1);
  }

  @Test
  void returnsZeroForEqualNumbers() {
    assertThat(solution.hammingDistance(0, 0)).isZero();
  }

  @Test
  void returnsThirtyOneForZeroAndMaximalInteger() {
    assertThat(solution.hammingDistance(0, Integer.MAX_VALUE)).isEqualTo(31);
  }
}
