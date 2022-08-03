package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float euro = Converter.rubleToEuro(in);
        boolean passed = euro == 2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        float dollar = Converter.rubleToDollar(in);
        passed = dollar == 2;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
