package com.company.Task25;

import com.company.Data_structures.Deq;

public class Main {
    public static void main(String[] args) throws Exception {
        Deq deq = new Deq(5);

        for (int i = 0; i < 5; i++){
            deq.pushFront(i);
        }
        while (!deq.empty()){
            System.out.print(deq.popBack());
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            deq.pushFront(i);
        }
        while (!deq.empty()){
            System.out.print(deq.popFront());
        }
    }
}
