package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void averagesMiddleSalariesOfFourEmployees() {
    assertThat(solution.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
  }

  @Test
  void returnsMiddleSalaryOfThreeEmployees() {
    assertThat(solution.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }

  @Test
  void handlesMinimalAndMaximalSalaries() {
    assertThat(solution.average(new int[] {1_000_000, 1000, 999_999})).isEqualTo(999_999.0);
  }

  @Test
  void handlesMaximalNumberOfEmployees() {
    int[] salaries = IntStream.rangeClosed(1, 100).map(i -> i * 1000).toArray();

    assertThat(solution.average(salaries)).isEqualTo(50_500.0);
  }
}
