package com.company.Task43;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Human> llist = new LinkedList<>();
        llist.add(new Human("A", "B", "A"));
        llist.add(new Human("D", "D", "D"));
        llist.add(new Human("A", "A", "A"));

        Collections.sort(llist);
        System.out.println(llist);
    }
}
