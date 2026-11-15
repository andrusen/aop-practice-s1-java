package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {

  private static T1 withFirstBad(int firstBad) {
    return new T1(version -> version >= firstBad);
  }

  @Test
  void findsFourthVersionAmongFive() {
    assertThat(withFirstBad(4).firstBadVersion(5)).isEqualTo(4);
  }

  @Test
  void returnsOnlyVersion() {
    assertThat(withFirstBad(1).firstBadVersion(1)).isEqualTo(1);
  }

  @Test
  void findsFirstVersionAmongMaximalCount() {
    assertThat(withFirstBad(1).firstBadVersion(Integer.MAX_VALUE)).isEqualTo(1);
  }

  @Test
  void findsLastVersionAmongMaximalCount() {
    assertThat(withFirstBad(Integer.MAX_VALUE).firstBadVersion(Integer.MAX_VALUE))
        .isEqualTo(Integer.MAX_VALUE);
  }
}
