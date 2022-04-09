package com.company.Task_45_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/company/Task_45/text.txt");
        Scanner in = new Scanner(fr);

        Map<String, Integer> word_count = new LinkedHashMap<>();

        while (in.hasNext()){
            String line = in.nextLine();
            if (line.isEmpty()){
                continue;
            }
            String[] line_arr = line.split(" +");
            for (String word: line_arr){
                Integer rezult = word_count.getOrDefault(word, 0);
                word_count.put(word, ++rezult);
            }
        }
        fr.close();

        ArrayList<String> word_for_file = new ArrayList<>();
        word_count.forEach((k, v) -> word_for_file.add(v + " " + k));
        word_for_file.sort((s1, s2) -> {
            Integer s1num = Integer.parseInt(s1.split(" ")[0]);
            Integer s2num = Integer.parseInt(s2.split(" ")[0]);;
            return s1num.compareTo(s2num);
        });

        FileWriter writer = new FileWriter("src/com/company/Task_45/answer.txt", false);
        for(String word : word_for_file){
            writer.write(word + "\n");
        }
        writer.flush();
    }
}