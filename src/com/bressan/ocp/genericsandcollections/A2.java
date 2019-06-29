package com.bressan.ocp.genericsandcollections;

import java.util.ArrayDeque;

public class A2 {
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<>();
        // adiciona elementos na pila representada pelo Deque
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        // remove e retorna o primeiro elemento do Deque
        // o mesmo que removeFirst()
        greetings.pop();
        // retorna mas nao remove o elemento do head do Deque
        // o mesmo que peekFirst
        greetings.peek();

        while (greetings.peek() != null)
            System.out.println(greetings.pop());
    }
}

        /**
         * all methods of ArrayDeque:
        add(Element e) : The method inserts particular element at the end of the deque.
        addFirst(Element e) : The method inserts particular element at the start of the deque.
        addLast(Element e) : The method inserts particular element at the end of the deque. It is similiar to add() method
        clear() : The method removes all deque elements.
        size() : The method returns the no. of elements in deque.
        clone() : The method copies the deque.
        contains(Obj) : The method checks whether a deque contains the element or not
        Iterator() : The method returns an iterator over the deque.
        descendingIterator() : The method returns a reverse order iterator over the deque
        element() : The method returns element at the head of the deque
        getFirst(): The method returns first element of the deque
        getLast(): The method returns last element of the deque
        isEmpty(): The method checks whether the deque is empty or not.
        toArray(): The method returns array having the elements of deque.
        offer(Element e) : The method inserts element at the end of deque.
        offerFirst(Element e) : The method inserts element at the front of deque.
        offerLast(Element e) : The method inserts element at the end of deque.
        peek() : The method returns head element without removing it.
        peekFirst() : The method returns first element without removing it.
        peekLast() : The method returns last element without removing it.
        poll() : The method returns head element and also removes it
        pollFirst() : The method returns first element and also removes it
        pollLast() : The method returns last element and also removes it
        pop() : The method pops out an element for stack repesented by deque
        push(Element e) : The method pushes an element onto stack repesented by deque
        remove() : The method returns head element and also removes it
        removeFirst() : The method returns first element and also removes it
        removeLast() : The method returns last element and also removes it
        removeFirstOccurrence(Obj) : The method removes the element where it first occur in the deque.
        removeLastOccurrence(Obj) : The method removes the element where it last occur in the deque.
         */
