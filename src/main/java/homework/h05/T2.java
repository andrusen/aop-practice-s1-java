package homework.h05;

// advanced
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        // Заповнюємо результуючий масив з кінця (від найбільших до найменших)
        for (int i = n - 1; i >= 0; i--) {
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
