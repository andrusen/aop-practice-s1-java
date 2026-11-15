package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private final T1 solution = new T1();

  @Test
  void recognizesAnagram() {
    assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
  }

  @Test
  void rejectsDifferentLettersOfSameLength() {
    assertThat(solution.isAnagram("rat", "car")).isFalse();
  }

  @Test
  void rejectsStringsOfDifferentLength() {
    assertThat(solution.isAnagram("a", "ab")).isFalse();
  }

  @Test
  void acceptsSameSingleLetter() {
    assertThat(solution.isAnagram("a", "a")).isTrue();
  }

  @Test
  void handlesMaximalLength() {
    String source = "ab".repeat(25_000);
    String target = "ba".repeat(25_000);

    assertThat(solution.isAnagram(source, target)).isTrue();
  }
}
