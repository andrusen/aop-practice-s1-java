package homework.h12;

// https://leetcode.com/problems/relative-sort-array/
public class T2 {

  private static final int MAX_VALUE = 1000;

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] counts = new int[MAX_VALUE + 1];
    for (int num : arr1) {
      counts[num]++;
    }

    int[] result = new int[arr1.length];
    int index = 0;

    for (int num : arr2) {
      while (counts[num] > 0) {
        result[index++] = num;
        counts[num]--;
      }
    }

    for (int value = 0; value <= MAX_VALUE; value++) {
      while (counts[value] > 0) {
        result[index++] = value;
        counts[value]--;
      }
    }

    return result;
  }
}
