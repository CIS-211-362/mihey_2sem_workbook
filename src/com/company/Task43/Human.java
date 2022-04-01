package com.company.Task43;

public class Human implements Comparable<Human> {
    private final String first_name;
    private final String second_name;
    private final String last_name;

    public Human(String first_name, String second_name, String last_name){
        this.first_name = first_name;
        this.second_name = second_name;
        this.last_name = last_name;
    }


    @Override
    public int compareTo(Human o) {
        int result = 0;
        result = first_name.compareTo(o.first_name);
        if (result != 0){
            return result;
        }
        result = second_name.compareTo(o.second_name);
        if (result != 0){
            return result;
        }
        result = last_name.compareTo(o.last_name);
        if (result != 0){
            return result;
        }
        return result;
    }

    public String toString() {
        return first_name + " " + second_name + " " + last_name;
    }
}
