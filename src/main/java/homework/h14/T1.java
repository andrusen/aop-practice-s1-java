package homework.h14;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class T1 {

  public String removeDuplicates(String text) {
    char[] chars = text.toCharArray();
    int size = 0;

    for (int i = 0; i < chars.length; i++) {
      chars[size] = chars[i];

      if (size > 0 && chars[size - 1] == chars[size]) {
        size -= 2;
      }

      size++;
    }

    return new String(chars, 0, size);
  }
}
