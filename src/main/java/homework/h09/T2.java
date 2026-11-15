package homework.h09;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T2 {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int maxCandies = 0;
    for (int candy : candies) {
      maxCandies = Math.max(maxCandies, candy);
    }

    List<Boolean> result = new ArrayList<>(candies.length);
    for (int candy : candies) {
      result.add(candy + extraCandies >= maxCandies);
    }

    return result;
  }
}
