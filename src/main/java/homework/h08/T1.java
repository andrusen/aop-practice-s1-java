package homework.h08;

// base
// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0; // Скидаємо лічильник при зустрічі з 0
            }
        }

        // Перевіряємо ще раз в кінці на випадок, якщо масив закінчується на 1
        return Math.max(maxCount, currentCount);
    }
}
