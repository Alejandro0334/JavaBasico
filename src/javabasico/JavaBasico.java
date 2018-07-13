/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class JavaBasico {

    listaSimple listaSimple;    
    
    public static void main(String[] args) {
        
       listaSimple lista = new listaSimple();
        try {

            for (int i = 0; i < 10; i++) {
                lista.insertar(""+ i +"");
                lista.insertar(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        listaArray lA = new listaArray();
        
        for (int i = 0; i < 10; i++) {
            lA.insertarNuevoElemento(""+ i +"");    
        }

        lA.mostrarElementos();

        System.out.println("Tamaño :" + lA.getTmax());
    }
    
}
