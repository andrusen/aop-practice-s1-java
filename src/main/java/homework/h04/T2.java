package homework.h04;

// https://leetcode.com/problems/number-complement/
public class T2 {

  public int findComplement(int num) {
    int remaining = num;
    int mask = 0;

    while (remaining > 0) {
      mask = (mask << 1) | 1;
      remaining >>= 1;
    }

    return num ^ mask;
  }
}
