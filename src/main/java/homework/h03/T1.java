package homework.h03;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {

  public double average(int[] salary) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int value : salary) {
      if (value < min) {
        min = value;
      }
      if (value > max) {
        max = value;
      }
      sum += value;
    }

    return (double) (sum - min - max) / (salary.length - 2);
  }
}
