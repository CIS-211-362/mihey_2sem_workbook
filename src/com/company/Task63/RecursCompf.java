package com.company.Task63;

public class RecursCompf {
    private static final int DEFSIZE = 256;
    private char[] str;
    private boolean was_number = false;
    private int index; //Число обработанных символов.

    public RecursCompf() {
        str = new char[DEFSIZE];
    }

    private void compileF() {
        compileT();


        while (true) {

            if (index >= str.length)
                return;

            if (str[index] == '+' && !was_number) {
                index++;
                compileT();
                System.out.print("+ ");
            } else if (str[index] == '-' && !was_number) {
                index++;
                compileT();
                System.out.print("- ");
            } else {
                return;
            }
        }


    }

    private void compileT() {
        compileM();

        while (true) {
            if (index >= str.length)
                return;

            if (str[index] == '*') {
                index++;
                compileM();
                System.out.print("* ");
            } else if (str[index] == '/') {
                index++;
                compileM();
                System.out.print("/ ");
            } else {
                return;
            }
        }
    }

    private void compileM() {
        if (str[index] == '(' ||
            str[index] == '[' ||
            str[index] == '{')
        {
            index++;
            compileF();
            index++;
        } else
            compileV();
        was_number = false;
    }

    private void compileV() {
        while (index < str.length &&
                (str[index] != '+' || !was_number) &&
                (str[index] != '-' || !was_number) &&
                str[index] != '*' &&
                str[index] != '/' &&
                str[index] != '(' &&
                str[index] != ')' &&
                str[index] != '[' &&
                str[index] != ']' &&
                str[index] != '{' &&
                str[index] != '}')
        {
            System.out.print("" + str[index++] + "");
            was_number = true;
        }
        System.out.print(" ");
    }

    public void compile(char[] str) {
        this.str = str;
        index = 0;
        compileF();
        System.out.print("\n");
    }
}
