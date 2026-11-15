package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void returnsBForFifthCharacter() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void returnsCForTenthCharacter() {
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void returnsAForFirstCharacter() {
    assertThat(solution.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void returnsHForMaximalPosition() {
    assertThat(solution.kthCharacter(500)).isEqualTo('h');
  }
}
