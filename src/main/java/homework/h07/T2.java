package homework.h07;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {

  public int numberOfSteps(int num) {
    int remaining = num;
    int steps = 0;

    while (remaining > 0) {
      if ((remaining & 1) == 0) {
        remaining >>= 1;
      } else {
        remaining--;
      }
      steps++;
    }

    return steps;
  }
}
