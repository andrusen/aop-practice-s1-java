package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void countsFourGoodPairs() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void countsAllPairsOfIdenticalNumbers() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void returnsZeroForDistinctNumbers() {
    assertThat(solution.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(solution.numIdenticalPairs(new int[] {100})).isZero();
  }

  @Test
  void handlesMaximalLength() {
    int[] nums = new int[100];
    Arrays.fill(nums, 100);

    assertThat(solution.numIdenticalPairs(nums)).isEqualTo(4950);
  }
}
