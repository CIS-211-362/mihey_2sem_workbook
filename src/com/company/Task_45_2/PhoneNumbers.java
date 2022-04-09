package com.company.Task_45_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumbers {
    private HashMap<String, String> phoneNumbersMap = new HashMap<>();

    public PhoneNumbers(String path) throws IOException {
        setPhoneNumbers(path);
    }

    private void setPhoneNumbers(String path) throws IOException {
        FileReader fr = new FileReader(path);
        Scanner in = new Scanner(fr);

        while (in.hasNext()){
            String line = in.nextLine();
            String fio = line.split(":")[0];
            String phoneNumber = line.split(":")[1];
            phoneNumbersMap.put(fio, phoneNumber);
        }
        fr.close();
    }

    public HashMap<String, String> getPhoneNumbers(){
        return phoneNumbersMap;
    }

    public void showAllPhoneNumbers(){
        System.out.println("Список номеров:");
        if (phoneNumbersMap.isEmpty()){
            System.out.println("Номеров нет");
            return;
        }
        for (Map.Entry entry : phoneNumbersMap.entrySet()){
            System.out.println("ФИО: " + entry.getKey() + "\t" + "Номер: "
                    + entry.getValue());
        }
    }

    public void search(String partFIO){
        System.out.println("Список номеров:");
        ArrayList<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry entry : phoneNumbersMap.entrySet()){
            if (((String) entry.getKey()).contains(partFIO)){
                String fio = (String) entry.getKey();
                String phoneNumber = (String) entry.getValue();
                phoneNumbers.add(fio + ": " + phoneNumber);
            }
        }
        if (phoneNumbers.isEmpty()){
            System.out.println("Номера не найдены");
        }
        for (String line: phoneNumbers){
            System.out.println(line);
        }
    }

    public void addPhoneNumber(String fio, String phoneNumber){
        phoneNumbersMap.put(fio, phoneNumber);
    }

    public void deletePhoneNumber(String FIO){
        phoneNumbersMap.remove(FIO);
    }
}
