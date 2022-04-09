package com.company.Task_45_2;


public class MenuAddPhoneNumber extends AbstractMenu{

    public MenuAddPhoneNumber(String title, String description, AbstractMenu previousMenu) {
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
                String fio = command.split(":")[0];
                String phoneNumber = command.split(":")[1];
                program.getPhoneNumbers().addPhoneNumber(fio, phoneNumber);
        }
    }
}
