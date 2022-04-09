package com.company.Task_45_2;


public abstract class AbstractMenu {
    String title = "Abstract";
    String[] commands = new String[0];
    AbstractMenu previousMenu;

    public AbstractMenu(String title){
        this.title = title;
    }

    public AbstractMenu(String title, AbstractMenu previousMenu){
        this.title = title;
        this.previousMenu = previousMenu;
    }

    public void setCommand(String[] commands){
        this.commands = commands;
    }

    public void giveCommand(String command, Program program){
        System.out.println("wefew");
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
        System.out.println();
        for(String command : commands){
            System.out.println(command);
        }
        System.out.print("Ввод: ");
    }
}
