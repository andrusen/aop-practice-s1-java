package homework.h06;

// base
// https://leetcode.com/problems/valid-anagram/
public class T1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        // Збільшуємо лічильник для символів з s і зменшуємо для t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        // Якщо це анаграма, всі значення в масиві мають дорівнювати 0
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
