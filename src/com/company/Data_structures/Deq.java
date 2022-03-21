package com.company.Data_structures;

public class Deq extends Queue {

    public Deq() {
        super();
    }
    public Deq(int capacity) {
        super(capacity);
    }
    private int backword(int index)  {
        return --index < 0 ? array.length - 1 : index;
    }

    public void pushFront(int val) throws Exception {
        if (++size > array.length)
            throw new Exception();

        array[head = backword(head)] = val;
    }

    public void pushFront(char val) throws Exception {
        if (++size > array.length)
            throw new Exception();

        array[head = backword(head)] = val;
    }

    public void pushBack(int val) throws Exception {
        super.push(val);
    }

    public void pushBack(char val) throws Exception {
        super.push(val);
    }

    public int popFront() throws Exception{
        return super.pop();
    }

    public int popBack() throws Exception {
        int val = back();
        tail = backword(tail);
        size -= 1;
        return val;
    }

    public int back() throws Exception {
        if (empty())
            throw new Exception();
        return array[tail];
    }
}

