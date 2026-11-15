package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T1 {

  public int missingNumber(int[] nums) {
    int length = nums.length;
    int expectedSum = length * (length + 1) / 2;

    int actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }
}
