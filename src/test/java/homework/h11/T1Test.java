package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void findsTwoAmongThreeNumbers() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void findsLastNumberOfRange() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void findsEightAmongNineNumbers() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void findsOneForSingleZero() {
    assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
  }

  @Test
  void findsZeroForSingleOne() {
    assertThat(solution.missingNumber(new int[] {1})).isZero();
  }

  @Test
  void findsZeroForMaximalLength() {
    int[] nums = IntStream.rangeClosed(1, 10_000).toArray();

    assertThat(solution.missingNumber(nums)).isZero();
  }
}
