package com.company.Task33;

import com.company.Data_structures.L1List;
import com.company.Data_structures.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        L1List<String> l1List = new L1List<>();
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
                window_number++;
                l1List.insert(new Node<>(name), window_number);
                name = "";
            }
            else if (list_command[0].equalsIgnoreCase("alt")){
                int n;
                if (list_command[1].equalsIgnoreCase("delete")){
                    l1List.remove(window_number);
                }
                else if(list_command[1].equalsIgnoreCase("tab")){
                    n = (list_command.length) - 1;
                    window_number = (window_number + n) % (l1List.getSize());
                    System.out.println(window_number);
                }
            }
            System.out.println(l1List.find_by_index(window_number));
            command = in.nextLine();
        }
    }
}