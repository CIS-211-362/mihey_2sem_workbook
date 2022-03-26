package com.company.Task29;

import com.company.Data_structures.L1List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        L1List<String> l1List = new L1List<>();
        System.out.println("Знак * остановка ввода команд");

        String command = in.nextLine();
        String[] list_command;
        int n;
        while (!command.equals("*")){
            list_command = command.split("[ +]+");
            if (list_command[0].equals("Run")){
                l1List.insert(list_command[1]);
            }
            else if (list_command[0].equals("Alt")){
                if (list_command[1].equals("Delete")){
                    l1List.erase();
                }
                else if(list_command[1].equals("Tab")){
                    n = (list_command.length) - 1;
                    for (int i = 0; i < n; i++){
                        l1List.forward();
                        if (l1List.end()){
                            l1List.toFront();
                        }
                    }
                }
            }
            System.out.println(l1List.after());
            command = in.nextLine();
        }
    }
}
