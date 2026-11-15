package homework.h16;

// https://leetcode.com/problems/find-the-town-judge/
public class T2 {

  public int findJudge(int people, int[][] trust) {
    int[] trustScores = new int[people + 1];

    for (int[] relation : trust) {
      trustScores[relation[0]]--;
      trustScores[relation[1]]++;
    }

    for (int person = 1; person <= people; person++) {
      if (trustScores[person] == people - 1) {
        return person;
      }
    }

    return -1;
  }
}
