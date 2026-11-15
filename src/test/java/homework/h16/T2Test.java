package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

  private final T2 solution = new T2();

  @Test
  void findsJudgeAmongTwoPeople() {
    assertThat(solution.findJudge(2, new int[][] {{1, 2}})).isEqualTo(2);
  }

  @Test
  void findsJudgeTrustedByEveryone() {
    assertThat(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}})).isEqualTo(3);
  }

  @Test
  void returnsMinusOneWhenCandidateTrustsSomeone() {
    assertThat(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}})).isEqualTo(-1);
  }

  @Test
  void returnsOnlyPersonForEmptyTrust() {
    assertThat(solution.findJudge(1, new int[][] {})).isEqualTo(1);
  }

  @Test
  void returnsMinusOneWhenNobodyTrusts() {
    assertThat(solution.findJudge(2, new int[][] {})).isEqualTo(-1);
  }

  @Test
  void findsJudgeAmongMaximalPeople() {
    int people = 1000;
    int[][] trust = new int[people - 1][];
    for (int i = 0; i < trust.length; i++) {
      trust[i] = new int[] {i + 1, people};
    }

    assertThat(solution.findJudge(people, trust)).isEqualTo(people);
  }
}
