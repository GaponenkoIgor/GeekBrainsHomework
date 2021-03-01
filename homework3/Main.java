package ru.geekbrains.homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();



    public static void main(String[] args) {


        System.out.println("Ваша задача угадать число за 3 попытки!");
        int range = 9;
        int number = (int) (Math.random() * range);
        playLevel(range, number);
        scanner.close();
    }

    private static void playLevel(int range, int number) {

        do {
            int i = 0;
            while (i++ < 3) {
                System.out.println("Угадай число от 0 до " + range);
                int input_number = scanner.nextInt();
                if (input_number == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (input_number > number) {
                    System.out.println("Заданное число меньше");
                    System.out.println("Попытка № " + i);
                } else {
                    System.out.println("Заданное число больше");
                    System.out.println("Попытка № " + i);
                }
            }System.out.print("Повторить игру еще раз? 1 – да / 0 – нет -> ");
        }while (scanner.next().equals("1")) ;
   }
}
