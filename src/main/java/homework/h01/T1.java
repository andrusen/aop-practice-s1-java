package homework.h01;

// base
// https://leetcode.com/problems/smallest-even-multiple/

public class T1 {
    public int smallestEvenMultiple(int n) {
        // If n is even, it is already a multiple of 2
        if (n % 2 == 0) {
            return n;
        }
        // If n is odd, the smallest multiple of both is n * 2
        return n * 2;
    }
}

