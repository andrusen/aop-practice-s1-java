package homework.h03;

// advanced
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
public class T2 {
    public int differenceOfSums(int n, int m) {
        // Загальна сума чисел від 1 до n
        int totalSum = n * (n + 1) / 2;

        // Кількість чисел у діапазоні, що діляться на m
        int k = n / m;

        // Сума всіх чисел, що діляться на m (num2)
        int num2 = m * k * (k + 1) / 2;

        // Повертаємо num1 - num2, що дорівнює totalSum - 2 * num2
        return totalSum - 2 * num2;
    }
}
