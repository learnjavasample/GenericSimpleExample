package ru.hse;


public class Pair <T, V> {

    private T first;
    private V second;

    public Pair() {
    }

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }


    /*
    //Такую перегрузку использовать нельзя из-за механизма стирания типов
    //Выдает ошибку: 'set(T)' clashes with 'set(V)'; both methods have same erasure
    //Вместо T и V может быть передан одинаковый тип и тогда невозможно будет выбрать метод.
    public void set(T first) {
        this.first = first;
    }

    public void set(V second) {
        this.second = second;
    }
     */
}
