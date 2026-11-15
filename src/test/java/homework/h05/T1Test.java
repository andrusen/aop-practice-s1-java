package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsThirtyFourForFiveNumbers() {
    assertThat(solution.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
  }

  @Test
  void returnsSixtyFourForSevenNumbers() {
    assertThat(solution.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }

  @Test
  void returnsZeroForMinimalEqualNumbers() {
    assertThat(solution.maxProductDifference(new int[] {1, 1, 1, 1})).isZero();
  }

  @Test
  void handlesMaximalValues() {
    assertThat(solution.maxProductDifference(new int[] {10_000, 1, 10_000, 1}))
        .isEqualTo(99_999_999);
  }

  @Test
  void handlesMaximalLength() {
    int[] nums = new int[10_000];
    Arrays.fill(nums, 3);
    nums[0] = 10_000;
    nums[9_999] = 1;

    assertThat(solution.maxProductDifference(nums)).isEqualTo(29_997);
  }
}
