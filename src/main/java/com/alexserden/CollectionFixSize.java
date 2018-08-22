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
            values[count - 1] = e;                                                               // заполняем наш массив до конца пока не вылетит исключение
            count++;                                                                             // после чего обрабатываем его в блоке catch

        } catch (ArrayIndexOutOfBoundsException exception) {

            E[] temp = values;                                                                   // создаем временный массив и копируем в него данные с массива values

           System.arraycopy(temp,1,values,0,temp.length-1);                // копируем с временного массива с второго элемента в values[0] при этом первый элемент теряется
                                                                                                 // остальные элементы сдвигаются на один элемент влево, последняя ячейка массива остается пустой
            values[values.length-1] = e;                                                         // добавляем наш элемент в последнюю ячейку


        }
        return true;
    }

    public E[] array() {
        return values;
    }
}


