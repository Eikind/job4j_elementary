package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int x = 2; x <= n; x++) {
        result = x * result;
    }
        return result;
    }
}
