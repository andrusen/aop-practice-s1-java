package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void returnsCountOfPositivesWhenTheyDominate() {
    assertThat(solution.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
  }

  @Test
  void ignoresZeros() {
    assertThat(solution.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
  }

  @Test
  void countsOnlyPositives() {
    assertThat(solution.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(solution.maximumCount(new int[] {0})).isZero();
  }

  @Test
  void countsSingleMinimalValue() {
    assertThat(solution.maximumCount(new int[] {-2000})).isEqualTo(1);
  }

  @Test
  void countsSingleMaximalValue() {
    assertThat(solution.maximumCount(new int[] {2000})).isEqualTo(1);
  }

  @Test
  void handlesMaximalLength() {
    int[] nums = new int[2000];
    Arrays.fill(nums, -2000);

    assertThat(solution.maximumCount(nums)).isEqualTo(2000);
  }
}
