package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void countsThreeMisplacedStudents() {
    assertThat(solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
  }

  @Test
  void countsAllStudentsMisplaced() {
    assertThat(solution.heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void returnsZeroForSortedHeights() {
    assertThat(solution.heightChecker(new int[] {1, 2, 3, 4, 5})).isZero();
  }

  @Test
  void returnsZeroForSingleStudent() {
    assertThat(solution.heightChecker(new int[] {1})).isZero();
  }

  @Test
  void handlesMinimalAndMaximalHeights() {
    assertThat(solution.heightChecker(new int[] {100, 1})).isEqualTo(2);
  }

  @Test
  void handlesMaximalLengthInReverseOrder() {
    int[] heights = IntStream.iterate(100, height -> height - 1).limit(100).toArray();

    assertThat(solution.heightChecker(heights)).isEqualTo(100);
  }
}
