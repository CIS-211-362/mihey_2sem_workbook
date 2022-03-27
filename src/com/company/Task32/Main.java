package com.company.Task32;

import com.company.Data_structures.L1List;
import com.company.Data_structures.Node;

public class Main {
    public static void main(String[] args) {
        L1List<Integer> l1List = new L1List<>();

        Node<Integer> n1, n2, n3, n4;
        n4 = new Node<>(4);

        System.out.println("Проверка индекса в пустом списке");
        System.out.println(l1List.find(n4));

        l1List.append(n1 = new Node<>(1));
        l1List.append(n2 = new Node<>(2));
        l1List.append(n3 = new Node<>(3));

        System.out.println("Проверка индекса в заполненном списке");
        System.out.println(l1List.find(n4));
        System.out.println(l1List.find(n1));

        System.out.println();

        System.out.println("Изначальный список");
        System.out.println(l1List);
        System.out.println("После добавление элемента в позицию 0");
        l1List.insert(n4, 0);
        System.out.println(l1List);

        System.out.println();

        System.out.println("Изначальный список");
        System.out.println(l1List);
        System.out.println("После удаления элемента в позиции 0");
        l1List.remove(2);
        System.out.println(l1List);









    }
}
