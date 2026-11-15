package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void findsMajorityInShortArray() {
    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void findsMajorityAfterCandidateChanges() {
    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void returnsSingleElement() {
    assertThat(solution.majorityElement(new int[] {-1_000_000_000})).isEqualTo(-1_000_000_000);
  }

  @Test
  void handlesBoundaryValues() {
    assertThat(solution.majorityElement(new int[] {1_000_000_000, -1_000_000_000, 1_000_000_000}))
        .isEqualTo(1_000_000_000);
  }
}
