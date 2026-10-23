package homework.h06;

// advanced
// https://leetcode.com/problems/valid-palindrome/
public class T2 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Пропускаємо не буквено-цифрові символи зліва
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Пропускаємо не буквено-цифрові символи справа
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Порівнюємо символи у нижньому регістрі
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
