package com.company.Task_45_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MenuStart extends AbstractMenu {
    MenuSearchPhoneNumber menuSearchPhoneNumber = new MenuSearchPhoneNumber("Поиск телефона по части ФИО", "Введите часть ФИО", this);
    MenuDeletePhoneNumber menuDeletePhoneNumber = new MenuDeletePhoneNumber("Удаление телефона", "Введите полное ФИО", this);
    MenuAddPhoneNumber menuAddPhoneNumber = new MenuAddPhoneNumber("Добавление телефона", "Введите данные вида {ФИО}:{номер}", this);

    public MenuStart(String title) {
        super(title);

        setCommand(new String[]{"1. показать номера", "2. поиск по ФИО", "3. удалить номер", "4. добавить номер", "5. выйти",});

        showMenu();
    }

    public void giveCommand(String command, Program program) throws IOException {
        switch (command) {
            case "1":
                program.getPhoneNumbers().showAllPhoneNumbers();
                break;
            case "2":
                program.setCurrentMenu(menuSearchPhoneNumber);
                break;
            case "3":
                program.setCurrentMenu(menuDeletePhoneNumber);
                break;
            case "4":
                program.setCurrentMenu(menuAddPhoneNumber);
                break;
            case "5":
                FileWriter writer = new FileWriter("src/com/company/Task_45_2/phone_numbers.txt", false);
                for (Map.Entry entry : program.getPhoneNumbers().getPhoneNumbers().entrySet()) {
                    String fio = (String) entry.getKey();
                    String phoneNumber = (String) entry.getValue();
                    writer.write(fio + ":" + phoneNumber + "\n");
                }
                writer.flush();
                System.exit(0);
        }
    }
}

