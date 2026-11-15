package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void removesNestedDuplicates() {
    assertThat(solution.removeDuplicates("abbaca")).isEqualTo("ca");
  }

  @Test
  void removesDuplicatesInMiddle() {
    assertThat(solution.removeDuplicates("azxxzy")).isEqualTo("ay");
  }

  @Test
  void keepsSingleCharacter() {
    assertThat(solution.removeDuplicates("a")).isEqualTo("a");
  }

  @Test
  void returnsEmptyStringWhenEverythingCancels() {
    assertThat(solution.removeDuplicates("aa")).isEmpty();
  }

  @Test
  void handlesMaximalLength() {
    assertThat(solution.removeDuplicates("a".repeat(100_000))).isEmpty();
  }
}
