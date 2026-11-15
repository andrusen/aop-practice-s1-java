package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsFizzForThree() {
    assertThat(solution.fizzBuzz(3)).containsExactly("1", "2", "Fizz");
  }

  @Test
  void returnsBuzzForFive() {
    assertThat(solution.fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void returnsFizzBuzzForFifteen() {
    assertThat(solution.fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void returnsSingleNumberForMinimalInput() {
    assertThat(solution.fizzBuzz(1)).containsExactly("1");
  }

  @Test
  void handlesMaximalInput() {
    assertThat(solution.fizzBuzz(10_000)).hasSize(10_000).last().isEqualTo("Buzz");
  }
}
