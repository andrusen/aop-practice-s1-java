package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void ignoresCaseAndPunctuation() {
    assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
  }

  @Test
  void rejectsNonPalindrome() {
    assertThat(solution.isPalindrome("race a car")).isFalse();
  }

  @Test
  void acceptsStringWithoutAlphanumericCharacters() {
    assertThat(solution.isPalindrome(" ")).isTrue();
  }

  @Test
  void acceptsSingleCharacter() {
    assertThat(solution.isPalindrome("a")).isTrue();
  }

  @Test
  void treatsDigitsAsAlphanumeric() {
    assertThat(solution.isPalindrome("0P")).isFalse();
  }

  @Test
  void handlesMaximalLength() {
    assertThat(solution.isPalindrome("a,".repeat(100_000))).isTrue();
  }
}
