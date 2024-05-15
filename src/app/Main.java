package app;

public class Main {

    static double CONV_С_F = 0;

    public static void main(String[] args) {
        System.out.println("Temperature converter from Celsius to Fahrenheit!!!");

        double C = 25;
        double celsius = convCeToFa(C);
        System.out.println("Result is " + celsius + "°.");
    }
        private static double convCeToFa ( double C) {
            return CONV_С_F = ((C * 9) / 5) + 32;
        }
}

