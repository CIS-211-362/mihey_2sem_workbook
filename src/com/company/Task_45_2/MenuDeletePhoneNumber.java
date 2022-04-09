package com.company.Task_45_2;

public class MenuDeletePhoneNumber extends AbstractMenu{

    public MenuDeletePhoneNumber(String title, String description, AbstractMenu previousMenu) {
        super(title, description, previousMenu);

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
                program.getPhoneNumbers().deletePhoneNumber(command);
        }
    }
}
