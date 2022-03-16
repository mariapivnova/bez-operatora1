package com.company;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    private static int variable(int num1, int num2)
    {
        if (num1 == 0 || num2 == 0)
            return 0;
        boolean negative = false;
        if (num1 < 0) {
            negative = true;
            num1 = -num1;
        }
        if (num2 < 0) {
            negative = !negative;
            num2 = -num2;
        }
        int result = 0;
        for (int i = 1; i <= num1; ++i)
            result += num2;
        return negative ? -result : result;
    }
    public static void main(final String[] args) {
        final Scanner scann = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        final int a = scann.nextInt();
        System.out.println("Введите второе число: ");
        final int b = scann.nextInt();
        System.out.println("Результат умножения: ");
        System.out.println(variable(a, b));
    }
}
