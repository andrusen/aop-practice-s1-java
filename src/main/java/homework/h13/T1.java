package homework.h13;

import java.util.function.IntPredicate;

// https://leetcode.com/problems/first-bad-version/
public class T1 {

  private final IntPredicate isBadVersion;

  public T1(IntPredicate isBadVersion) {
    this.isBadVersion = isBadVersion;
  }

  public int firstBadVersion(int versionCount) {
    int left = 1;
    int right = versionCount;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (isBadVersion.test(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
