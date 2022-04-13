package com.company;

import java.util.Collections;
import java.util.Stack;


//Стековый компилятор формул.
public class Compf extends Stack<Character> {
    //Типы символов (скобки, знаки операций, иное).
    private final char ignoreChar = 'b';
    private Stack<Character> stackAnother = new Stack<>();
    protected final static int
            SYM_LEFT = 0,
            SYM_RIGHT = 1,
            SYM_OPER = 2,
            SYM_OTHER = 3;

    private int symType(char c) {
        switch (c) {
            case '(':
                return SYM_LEFT;
            case ')':
                return SYM_RIGHT;
            case '+':
            case '-':
            case '*':
            case '/':
                return SYM_OPER;
            default:
                return symOther(c);
        }
    }

    private void processSymbol(char c) {
        switch (symType(c)) {
            case SYM_LEFT:
                push(c);
                break;
            case SYM_RIGHT:
                processSuspendedSymbols(c);
                if (!stackAnother.empty()) {
                    System.out.print(stackAnother.pop());
                }
                pop();
                break;
            case SYM_OPER:
                processSuspendedSymbols(c);
                push(c);
                System.out.print(" ");
                break;
            case SYM_OTHER:
                nextOther(c);
                break;
        }
    }


    private void processSuspendedSymbols(char c) {
        while (precedes(peek(), c)) {
            if (peek().equals('*') | (peek().equals('/') && stackAnother.peek().equals(ignoreChar)) && stackAnother.contains(ignoreChar)) {
                pop();
                stackAnother.remove(stackAnother.indexOf(ignoreChar));
                continue;
            }

            Collections.reverse(stackAnother);
            if (peek().equals('*') || peek().equals('+')) {
                Collections.sort(stackAnother, Collections.reverseOrder());
            }

            while (!stackAnother.empty()) System.out.print(stackAnother.pop() + " ");
            nextOper(pop());
        }
    }

    private int priority(char c) {
        return c == '+' || c == '-' ? 1 : 2;
    }

    private boolean precedes(char a, char b) {
        if (symType(a) == SYM_LEFT)
            return false;
        if (symType(b) == SYM_RIGHT)
            return true;

        return priority(a) >= priority(b);
    }

    protected int symOther(char c) {
        if (c < 'a' || c > 'z') {
            System.out.println("Недопустимый символ: " + c);
            System.exit(0);
        }

        return SYM_OTHER;
    }

    protected void nextOper(char c) {
        System.out.print(" " + c + "");
    }

    protected void nextOther(char c) {
        stackAnother.push(c);
    }

    public void compile(char[] str) {
        processSymbol('('); //!

        for (char c : str) processSymbol(c);

        processSymbol(')'); //!

        System.out.print("\n");
    }
}