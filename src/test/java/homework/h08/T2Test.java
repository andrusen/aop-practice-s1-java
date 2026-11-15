package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void countsThreePairsBelowTwo() {
    assertThat(solution.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void countsTenPairsBelowMinusTwo() {
    assertThat(solution.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(solution.countPairs(List.of(5), 50)).isZero();
  }

  @Test
  void countsAllPairsForMaximalTarget() {
    assertThat(solution.countPairs(Collections.nCopies(50, -50), 50)).isEqualTo(1225);
  }

  @Test
  void returnsZeroForMinimalTarget() {
    assertThat(solution.countPairs(Collections.nCopies(50, 50), -50)).isZero();
  }
}
