package com.alexserden;


public class CollectionFixSize<E> {
    private int maxCapacity;
    private E[] values;
    private int count;

    public CollectionFixSize() {
        maxCapacity = 16;
        this.values = (E[]) new Object[maxCapacity];
        count = values.length;
    }

    public CollectionFixSize(int capacity) {
        maxCapacity = capacity;
        this.values = (E[]) new Object[maxCapacity];
        count = values.length;
    }

    public boolean add(E e) {
        try {
            values[count - 1] = e;
            count++;

        } catch (ArrayIndexOutOfBoundsException exception) {

            E[] temp = values;

           System.arraycopy(temp,1,values,0,temp.length-1);

            values[values.length-1] = e;


        }
        return true;
    }

    public E[] array() {
        return values;
    }
}


