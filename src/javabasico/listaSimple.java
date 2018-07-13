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
public class listaSimple {
    
    protected nodo primero;
    private nodo nodoActual = null;
    
    public listaSimple() {
        this.primero = null;
    }
        
    public nodo getNodoActual() {
        return nodoActual;
    }

    public void setNodoActual(nodo nodoActual) {
        this.nodoActual = nodoActual;
    }
    
    public void insertar(Object dato) throws Exception
    {
        nodo temporal = new nodo(dato, null);
        temporal.setNext(primero);
        primero = temporal;
    }
    
    public void imprimir(int n) {
    
    if (!vacio()) {
      nodo temporal = primero;

      for (int i = 0; i < n; i++) {
        temporal = temporal.getNext();
        if (temporal == null)
          return;
      }
      System.out.println(temporal.getValue());
    }
  }
    
  public boolean vacio() {
    if(primero == null)
      return true;
    else
      return false;
  }
    
    
}
