package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAllMethods(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumMinusAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAllMethods(10, 20));

    }
}
