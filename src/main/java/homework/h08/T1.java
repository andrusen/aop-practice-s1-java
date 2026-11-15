package homework.h08;

// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {

  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int currentCount = 0;

    for (int num : nums) {
      if (num == 1) {
        currentCount++;
      } else {
        maxCount = Math.max(maxCount, currentCount);
        currentCount = 0;
      }
    }

    return Math.max(maxCount, currentCount);
  }
}
