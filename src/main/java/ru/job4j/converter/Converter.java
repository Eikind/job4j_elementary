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
        float euroIn = 140;
        float euroExpected = 2;
        float euroOut = Converter.rubleToEuro(euroIn);
        boolean euroPassed = euroExpected == euroOut;
        float dollarIn = 180;
        float dollarExpected = 3;
        float dollarOut = Converter.rubleToDollar(dollarIn);
        boolean dollarPassed = dollarExpected == dollarOut;
        System.out.println("140 rubles are 2. Test result : " + euroPassed);
        System.out.println("180 rubles are 3. Test result : " + dollarPassed);
    }
}
