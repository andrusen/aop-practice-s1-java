package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {
        public int findComplement(int num) {
            // Створюємо копію num, щоб визначити довжину числа в бітах
            int temp = num;
            int mask = 0;

            // Будуємо маску потрібної довжини, що складається з одиниць
            // Наприклад, якщо num = 101 (5), маска стане 111 (7)
            while (temp > 0) {
                mask = (mask << 1) | 1;
                temp >>= 1;
            }

            // Застосовуємо XOR між оригінальним числом та маскою
            return num ^ mask;
        }
}
