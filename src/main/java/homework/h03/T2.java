package homework.h03;

// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
public class T2 {

  public int differenceOfSums(int limit, int divisor) {
    int totalSum = limit * (limit + 1) / 2;
    int multiplesCount = limit / divisor;
    int divisibleSum = divisor * multiplesCount * (multiplesCount + 1) / 2;
    return totalSum - 2 * divisibleSum;
  }
}
