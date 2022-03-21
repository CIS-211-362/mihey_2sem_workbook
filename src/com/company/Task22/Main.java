package com.company.Task22;

import com.company.Data_structures.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        for (char symbol : a.toCharArray()) {
            switch (symbol) {
                case '(':
                    s.push(symbol);
                    break;
                case '[':
                    s.push(symbol);
                    break;
                case '{':
                    s.push(symbol);
                    break;
                case ')':
                    if (s.pop() != '(') {
                        System.out.println("Не правильно");
                        return;
                    }
                    break;
                case ']':
                    if (s.pop() != '[') {
                        System.out.println("Не правильно");
                        return;
                    }
                    break;
                case '}':
                    if (s.pop() != '{') {
                        System.out.println("Не правильно");
                        return;
                    }
                    break;
            }
        }
        if (s.empty()) {
            System.out.println("Правильно");
        }
        else{
            System.out.println("Не правильно");
        }
    }
}