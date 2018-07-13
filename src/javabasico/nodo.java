/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author Alejandro
 */
public class nodo {
    private Object value;
    private nodo next;

    public nodo(Object value, nodo next) {
        this.value = value;
        this.next = next;
    }
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "value=" + value + ", next=" + next;
    }
}
