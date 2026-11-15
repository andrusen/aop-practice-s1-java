package homework.h05;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {

  public int[] sortedSquares(int[] nums) {
    int[] result = new int[nums.length];
    int left = 0;
    int right = nums.length - 1;

    for (int i = nums.length - 1; i >= 0; i--) {
      int squareLeft = nums[left] * nums[left];
      int squareRight = nums[right] * nums[right];

      if (squareLeft > squareRight) {
        result[i] = squareLeft;
        left++;
      } else {
        result[i] = squareRight;
        right--;
      }
    }

    return result;
  }
}
