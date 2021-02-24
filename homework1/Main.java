package ru.geekbrains.lesson1.homework1;

public class Main {

    public static void main(String[] args) {

//        byte a =  127;
//        short b = 12;
//        int c = 10;
//        long d =20000000000000L;
//        float e = 12.4f;
//        double f =23.2;
//        char g = 'B';
//        boolean h = true;
//        boolean h = false;
    }
    public static float zadanie3(float a, float b, float c , float d) {

        return a*(b+(c/d));
    }
    public static boolean zadanie4(int a, int b) {

        int sum = a+b;

        return sum>=10 && sum<=20 ;
        }

    public static void zadanie5(int number) {
        if (number >= 0) {
            System.out.println( "Число положительное");
            System.out.println( "Число отрицательное");
        }
    }
    public static boolean zadanie6(int number){
        return number < 0;
    }
    public static void zadanie7(String name) {
        System.out.println("Привет, " + name + " !");
    }


}

