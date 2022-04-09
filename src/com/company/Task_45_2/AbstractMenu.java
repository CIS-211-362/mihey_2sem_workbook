package com.company.Task_45_2;


import java.io.IOException;

public abstract class AbstractMenu {
    String title = "Abstract";
    String description = "";
    String[] commands = new String[0];
    AbstractMenu previousMenu;

    public AbstractMenu(String title){
        this.title = title;
    }

    public AbstractMenu(String title, AbstractMenu previousMenu){
        this.title = title;
        this.previousMenu = previousMenu;
    }

    public AbstractMenu(String title, String description, AbstractMenu previousMenu){
        this.title = title;
        this.previousMenu = previousMenu;
        this.description = description;
    }

    public void setCommand(String[] commands){
        this.commands = commands;
    }

    public void giveCommand(String command, Program program) throws IOException {
    }

    public void showMenu(){
        showGreet();
        showCommand();
    }

    public void showGreet(){
        System.out.println("Меню: " + title);
        if (commands.length > 0){
            System.out.println("Команды:");
        }
    }

    public void showCommand(){
        if (!description.isEmpty()){
            System.out.println(description);
        }
        for(String command : commands){
            System.out.println(command);
        }
        System.out.print("Ввод: ");
    }
}
