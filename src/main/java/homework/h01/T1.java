package homework.h01;

// https://leetcode.com/problems/smallest-even-multiple/
public class T1 {

  public int smallestEvenMultiple(int number) {
    if (number % 2 == 0) {
      return number;
    }
    return number * 2;
  }
}
