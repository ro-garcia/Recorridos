/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recorridos;

/**
 *
 * @author rgarcia
 */
public class ArbolBinario {
    
    
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

 
    public void recorridoPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + "");  
            recorridoPreorden(nodo.izquierdo);  
            recorridoPreorden(nodo.derecho);    
        }
    }
    
      public void recorridoEnorden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnorden(nodo.izquierdo);  
            System.out.print(nodo.valor + "");  
            recorridoEnorden(nodo.derecho);    
        }
    }

   
    public void recorridoPostorden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostorden(nodo.izquierdo);  
            recorridoPostorden(nodo.derecho);    
            System.out.print(nodo.valor + "");  
        }
    }

 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
}
