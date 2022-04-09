package com.company.Task_45_2;

import java.io.IOException;

public class Program {
    AbstractMenu current_menu;
    PhoneNumbers phoneNumbers = new PhoneNumbers("src/com/company/Task_45_2/phone_numbers.txt");

    public Program() throws IOException {
        current_menu = new MenuStart("Стартовое меню");
    }

    public void setCurrentMenu(AbstractMenu menu){
        System.out.println();
        current_menu = menu;
        current_menu.showGreet();
    }

    public PhoneNumbers getPhoneNumbers(){
        return phoneNumbers;
    }

    public void giveCommand(String command) throws IOException {
        current_menu.giveCommand(command, this);
        current_menu.showCommand();
    }
}
