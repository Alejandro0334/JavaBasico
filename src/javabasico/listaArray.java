/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.Arrays;

/**
 *
 * @author Alejandro
 */
public class listaArray {
    
    private Object[] values;
    private int Tmax = 2;  
    private int posicion;
    private final static int INCREMENTO = 2;
    
    public int getTmax() {
        return Tmax;
    }
    
   public listaArray() {
        this.values = new Object[this.Tmax];
        this.posicion=0;
    }
    
    public void insertarNuevoElemento(Object objeto){

    if((posicion) == (this.Tmax/INCREMENTO)){  
        
         this.values = Arrays.copyOf(values,this.Tmax * INCREMENTO);
         
         this.Tmax = this.Tmax * INCREMENTO;
    }
     this.values[this.posicion]=objeto;
     this.posicion ++; 
     
    }
    
    public void mostrarElementos(){
    
        for (int i = 0; i < this.posicion; i++) {
            System.out.println(this.values[i].toString());
        }
    }
    
}
