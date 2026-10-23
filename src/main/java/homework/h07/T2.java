package homework.h07;

// advanced
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if ((num & 1) == 0) {
                // Якщо парне — ділимо на 2 (зсув вправо)
                num >>= 1;
            } else {
                // Якщо непарне — віднімаємо 1
                num--;
            }
            steps++;
        }

        return steps;
    }
}
