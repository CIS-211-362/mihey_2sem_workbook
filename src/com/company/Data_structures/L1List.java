package com.company.Data_structures;

public class L1List<T>{
    private Node<T> first, last; //Ссылки на первый и последний узлы.
    private int size;

    public L1List(){
        first = last = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }


    public void append(Node<T> node){
        node.next = null;

        if(first == null) //Первый элемент.
            first = node;

        if(last != null)
            last.next = node;

        last = node;
        size++;
    }

    public void insert(Node<T> node, int location){
        // берем предыдущий элемент
        Node<T> node_before_index = find_by_index(location - 1);
        Node<T> node_for_index;

        if (location == 0){
            node.next = first;
            first = node;
            size++;
        }
        else if (location == size){
            if (last == null){
                first.next = node;
                last = node;
            }
            else{
                last.next = node;
                last = node;
            }
            size++;
        }
        // если предыдущий элемент существует или он не являлся последним
        else if (node_before_index != null && node_before_index != last){
            node_for_index = node_before_index.next;
            node_before_index.next = node;
            node.next = node_for_index;
            size++;
        }
    }

    public void remove(int location){
        // берем предыдущий элемент
        Node<T> node_before_index = find_by_index(location - 1);
        Node<T> node_for_index = null;

        if (location == 0){
            first = first.next;
            size--;
        }
        else if (location == size - 1){
            node_before_index.next = null;
            last = node_before_index;
            size--;
        }
        else if (node_before_index != null){
            node_for_index = node_before_index.next;
            node_before_index.next = node_for_index.next;
            size--;
        }
    }

    public Node<T> find_by_index(int index){
        Node<T> result = null;

        if (first == null || index >= size || index < 0){
            return result;
        }
        else if (index == size - 1){
            if (size == 1){
                return first;
            }
            return last;
        }
        int n = 0;
        Node<T> node = first;
        do{
            if (n == index){
                result = node;
                break;
            }
            node = node.next;
            n++;
        }
        while (node.next != null);

        return result;
    }

    public int find(Node<T> node){
        Node<T> original = node;

        int index = -1;
        if (first == null){
            return index;
        }
        if (last == node){
            return size -1;
        }

        node = first;
        int n = 0;
        do {
            if (node == original){
                index = n;
                break;
            }
            node = node.next;
            n++;
        }
        while (node != null);

        return index;
    }

    public String toString() {
        String result = "[";
        Node<T> node = first;
        do {
            result += node.toString();
            if (node.next != null){
                result += ", ";
            }
            node = node.next;
        }
        while (node != null);
        return result + "]";
    }
}