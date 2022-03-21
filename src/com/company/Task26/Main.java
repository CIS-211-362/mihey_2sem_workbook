package com.company.Task26;

import com.company.Data_structures.Deq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        Deq deq = new Deq(a.length());

        for (char c : a.toCharArray()) {
            deq.pushBack(c);
        }

        boolean flag = true;
        int r1, r2;
        while (!deq.empty()) {
            r1 = deq.popBack();
            // если количество букв нечетное, то мы доходим до серединной буквы, проверку можно не делать
            try {
                r2 = deq.popFront();
            } catch (Exception ignored) {
                break;
            }
            if (r1 != r2){
                flag = false;
            }
        }
        if (flag){
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
    }
}

