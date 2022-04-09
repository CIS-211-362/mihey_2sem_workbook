package com.company.Task_45_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Program program = new Program();

        Scanner in = new Scanner(System.in);

        String command;
        while (true) {
            command = in.nextLine();
            program.giveCommand(command);
        }
    }
}
