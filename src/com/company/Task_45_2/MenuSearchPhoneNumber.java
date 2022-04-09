package com.company.Task_45_2;

public class MenuSearchPhoneNumber extends AbstractMenu {

    public MenuSearchPhoneNumber(String title, AbstractMenu previousMenu) {
        super(title, previousMenu);

        setCommand(new String[]{
                "1. exit",
        });
    }

    public void giveCommand(String command, Program program){
        switch(command){
            case "1":
                program.setCurrentMenu(previousMenu);
                break;
            default:
                String phoneNumbers = program.getPhoneNumbers().search(command);
                System.out.println(phoneNumbers);
        }
    }
}
