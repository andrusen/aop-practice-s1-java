package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void findsTrailingRunOfThree() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void findsMiddleRunOfTwo() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {0})).isZero();
  }

  @Test
  void returnsOneForSingleOne() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1})).isEqualTo(1);
  }

  @Test
  void keepsLongerEarlierRun() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 0})).isEqualTo(2);
  }

  @Test
  void handlesMaximalLengthOfOnes() {
    int[] nums = new int[100_000];
    Arrays.fill(nums, 1);

    assertThat(solution.findMaxConsecutiveOnes(nums)).isEqualTo(100_000);
  }
}
