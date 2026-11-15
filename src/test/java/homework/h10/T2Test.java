package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void reversesOddLengthWord() {
    char[] chars = "hello".toCharArray();

    solution.reverseString(chars);

    assertThat(chars).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void reversesEvenLengthWord() {
    char[] chars = "Hannah".toCharArray();

    solution.reverseString(chars);

    assertThat(chars).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void keepsSingleCharacter() {
    char[] chars = {'x'};

    solution.reverseString(chars);

    assertThat(chars).containsExactly('x');
  }

  @Test
  void reversesMaximalLength() {
    char[] chars = "ab".repeat(50_000).toCharArray();

    solution.reverseString(chars);

    assertThat(new String(chars)).isEqualTo("ba".repeat(50_000));
  }
}
