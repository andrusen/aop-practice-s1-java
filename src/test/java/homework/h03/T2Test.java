package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsNineteenForTenAndThree() {
    assertThat(solution.differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void returnsWholeSumWhenDivisorExceedsLimit() {
    assertThat(solution.differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void returnsNegatedSumWhenDivisorIsOne() {
    assertThat(solution.differenceOfSums(5, 1)).isEqualTo(-15);
  }

  @Test
  void handlesMinimalInput() {
    assertThat(solution.differenceOfSums(1, 1)).isEqualTo(-1);
  }

  @Test
  void handlesMaximalInput() {
    assertThat(solution.differenceOfSums(1000, 1000)).isEqualTo(498_500);
  }
}
