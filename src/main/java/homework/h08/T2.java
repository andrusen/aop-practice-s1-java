package homework.h08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class T2 {

  public int countPairs(List<Integer> nums, int target) {
    List<Integer> sorted = new ArrayList<>(nums);
    Collections.sort(sorted);

    int count = 0;
    int left = 0;
    int right = sorted.size() - 1;

    while (left < right) {
      if (sorted.get(left) + sorted.get(right) < target) {
        count += right - left;
        left++;
      } else {
        right--;
      }
    }

    return count;
  }
}
