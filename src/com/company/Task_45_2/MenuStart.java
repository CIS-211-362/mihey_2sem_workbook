package com.company.Task_45_2;

public class MenuStart extends AbstractMenu{
    MenuSearchPhoneNumber menuSearchPhoneNumber = new MenuSearchPhoneNumber("Поиск телефона по части ФИО", this);
    MenuDeletePhoneNumber menuDeletePhoneNumber = new MenuDeletePhoneNumber("Удаление телефона", this);

    public MenuStart(String title){
        super(title);

        setCommand(new String[]{
                "1. показать номера",
                "2. поиск по ФИО",
                "3. удалить номер",
        });

        showMenu();
    }

    public void giveCommand(String command, Program program){
        switch(command){
            case "1":
                program.getPhoneNumbers().showAllPhoneNumbers();
                break;
            case "2":
                program.setCurrentMenu(menuSearchPhoneNumber);
            case "3":
                program.setCurrentMenu(menuDeletePhoneNumber);
        }
    }
}
