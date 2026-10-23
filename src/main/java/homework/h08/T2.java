package homework.h08;

// advanced
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

import java.util.Collections;
import java.util.List;
public class T2 {
    public int countPairs(List<Integer> nums, int target) {
        // Сортуємо список по зростанню
        Collections.sort(nums);

        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // Якщо сума менша за target, то будь-який елемент до right
                // в парі з left також дасть суму меншу за target
                count += (right - left);
                left++; // Зсуваємо лівий вказівник, щоб перевірити наступне число
            } else {
                // Якщо сума занадто велика, зсуваємо правий вказівник
                right--;
            }
        }

        return count;
    }
}
