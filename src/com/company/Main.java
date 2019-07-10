package com.company;
import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int num = in.nextInt();

        System.out.printf("Таблица умножения для %d: \n", num);

        System.out.printf("%d x 1 = %d\n", num, num*1);

        System.out.printf("%d x 2 = %d\n", num, num*2);

        System.out.printf("%d x 3 = %d\n", num, num*3);

        System.out.printf("%d x 4 = %d\n", num, num*4);

        System.out.printf("%d x 5 = %d\n", num, num*5);

        System.out.printf("%d x 6 = %d\n", num, num*6);

        System.out.printf("%d x 7 = %d\n", num, num*7);

        System.out.printf("%d x 8 = %d\n", num, num*8);

        System.out.printf("%d x 9 = %d\n", num, num*9);

        System.out.printf("%d x 10 = %d\n", num, num*10);

        in.close();

    }

}