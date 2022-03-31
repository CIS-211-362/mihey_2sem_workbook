package com.company.Task42;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        LinkedList<String> l1List = new LinkedList<>();
        System.out.println("Знак * остановка ввода команд");

        String command = in.nextLine();
        String[] list_command;
        String name = "";
        int window_number = -1;
        while (!command.equals("*")){
            list_command = command.split("[ +]+");
            if (list_command[0].equalsIgnoreCase("Run")){
                for (int i = 1; i < list_command.length; i++){
                    name += (list_command[i] + " ");
                }
                l1List.add(name);
                window_number=l1List.size() - 1;
                name = "";
            }
            else if (list_command[0].equalsIgnoreCase("alt")){
                int n;
                if (list_command[1].equalsIgnoreCase("delete")){
                    l1List.remove(window_number);
                }
                else if(list_command[1].equalsIgnoreCase("tab")){
                    n = (list_command.length) - 1;
                    window_number = (window_number + n) % (l1List.size());
                }
            }
            System.out.println(l1List.get(window_number));
            command = in.nextLine();
        }
    }
}