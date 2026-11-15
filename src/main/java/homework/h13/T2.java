package homework.h13;

// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {

  public int maximumCount(int[] nums) {
    int negativeCount = lowerBound(nums, 0);
    int positiveCount = nums.length - lowerBound(nums, 1);
    return Math.max(negativeCount, positiveCount);
  }

  private int lowerBound(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] >= target) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
