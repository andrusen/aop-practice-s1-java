package homework.h04;

// https://leetcode.com/problems/hamming-distance/
public class T1 {

  public int hammingDistance(int first, int second) {
    int differentBits = first ^ second;
    int distance = 0;

    while (differentBits != 0) {
      distance++;
      differentBits &= differentBits - 1;
    }

    return distance;
  }
}
