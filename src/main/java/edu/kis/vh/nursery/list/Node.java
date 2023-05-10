package edu.kis.vh.nursery.list;

/**
 * Klasa przechowuje wartość liczbową VALUE a także dwie instancje samej siebie: prev i next.
 * Zawiera również metody pozwalające na podstawowe działania na atrybutach. Są to:
 * getVALUE(), getPrev(), setPrev(), getNext(), setNext(), a także konstruktor samej klasy.
 */
public class Node {

    protected final int VALUE;
    protected Node prev, next;

    /**
     * Konstruktor przyjmujący jeden argument.
     * @param i jest int'em i jest przypisywany do VALUE
     */
    public Node(int i) {
        VALUE = i;
    }

    /**
     *
     * @return zwraca wartość VALUE danego obiektu
     */
    public int getVALUE() {
        return VALUE;
    }

    /**
     *
     * @return zwraca obiekt prev
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *
     * @param prev danej klasy zostaje ustawiony na obiekt pobrany jako argument
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return zwraca obiekt next
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @param next danej klasy zostaje ustawiony na obiekt pobrany jako argument
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
}
