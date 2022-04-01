package com.company.Task52;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String stop_frazes = "*";
        System.out.println("Знак " + stop_frazes + " остановка ввода");
        String regex1 = "((1|2|3|4|5|6|7|8|9)+0*)*";
        System.out.println("Множество натуральных чисел");
        String input = in.nextLine();
        while(!input.equals("*")) {
            boolean result = input.matches(regex1); //Проверка строки на соответсвие регулярному выражению (языку).
            System.out.println(result);
            input = in.nextLine();
        }

        String regex2 = "-?((1|2|3|4|5|6|7|8|9)+0*)+\\.?(0|1|2|3|4|5|6|7|8|9)*|0";
        System.out.println("Множество действительных чисел");
        input = in.nextLine();
        while(!input.equals("*")) {
            boolean result = input.matches(regex2); //Проверка строки на соответсвие регулярному выражению (языку).
            System.out.println(result);
            input = in.nextLine();
        }

        String regex3 = "[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]+";
        System.out.println("Электронные потчы");
        input = in.nextLine();
        while(!input.equals("*")) {
            boolean result = input.matches(regex3); //Проверка строки на соответсвие регулярному выражению (языку).
            System.out.println(result);
            input = in.nextLine();
        }
    }
}
