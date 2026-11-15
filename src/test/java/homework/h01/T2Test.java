package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void countsThreeOddsBetweenThreeAndSeven() {
    assertThat(solution.countOdds(3, 7)).isEqualTo(3);
  }

  @Test
  void countsOneOddBetweenEightAndTen() {
    assertThat(solution.countOdds(8, 10)).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(solution.countOdds(0, 0)).isZero();
  }

  @Test
  void returnsOneForSingleOddNumber() {
    assertThat(solution.countOdds(7, 7)).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleMaximalEvenNumber() {
    assertThat(solution.countOdds(1_000_000_000, 1_000_000_000)).isZero();
  }

  @Test
  void countsHalfOfWholeAllowedRange() {
    assertThat(solution.countOdds(0, 1_000_000_000)).isEqualTo(500_000_000);
  }
}
