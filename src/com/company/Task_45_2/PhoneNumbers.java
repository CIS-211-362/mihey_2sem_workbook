package com.company.Task_45_2;

import java.io.FileReader;
import java.io.IOException;
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
        if (phoneNumbersMap.isEmpty()){
            System.out.println("Номеров нет");
            return;
        }
        for (Map.Entry entry : phoneNumbersMap.entrySet()){
            System.out.println("ФИО: " + entry.getKey() + "\t Номер: "
                    + entry.getValue());
        }
    }

    public String search(String partFIO){
        String phoneNumber = null;
        for (Map.Entry entry : phoneNumbersMap.entrySet()){
            if (((String) entry.getKey()).contains(partFIO)){
                phoneNumber = (String) entry.getValue();
                break;
            }
        }
        return phoneNumber;
    }

    public void deletePhoneNumber(String FIO){
        phoneNumbersMap.remove(FIO);
    }
}
