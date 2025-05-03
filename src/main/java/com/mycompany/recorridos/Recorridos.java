/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recorridos;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rgarcia
 */
public class Recorridos {

    public static void main(String[] args) {
          
       
       // Creación de nodos para el Árbol A
ArbolBinario arbolA = new ArbolBinario();
Nodo nodo1_1 = new Nodo("a");
Nodo nodo1_2 = new Nodo("b");
Nodo nodo1_3 = new Nodo("*");
Nodo nodo1_4 = new Nodo("c");
Nodo nodo1_5 = new Nodo("d");
Nodo nodo1_6 = new Nodo("/");
Nodo nodo1_7 = new Nodo("+");

nodo1_3.izquierdo = nodo1_1;
nodo1_3.derecho = nodo1_2;
nodo1_6.izquierdo = nodo1_4;
nodo1_6.derecho = nodo1_5;
nodo1_7.izquierdo = nodo1_3;
nodo1_7.derecho = nodo1_6;

arbolA.setRaiz(nodo1_7);
        
        // Creacion de nodos para el B
      ArbolBinario arbolB = new ArbolBinario();
Nodo nodo2_1 = new Nodo("a");  // 
Nodo nodo2_2 = new Nodo("b");   
Nodo nodo2_3 = new Nodo("+");   
Nodo nodo2_4 = new Nodo("+");
Nodo nodo2_5 = new Nodo("+"); 
Nodo nodo2_6 = new Nodo("c");
Nodo nodo2_7 = new Nodo("d"); 

nodo2_4.izquierdo = nodo2_5;   
nodo2_4.derecho = nodo2_6;     
nodo2_5.izquierdo = nodo2_1;
nodo2_5.derecho = nodo2_2;
nodo2_3.izquierdo = nodo2_4;
nodo2_3.derecho = nodo2_7;

arbolB.setRaiz(nodo2_3);

// Crear los nodos para el Árbol C
ArbolBinario arbolC = new ArbolBinario();

Nodo nodo3_1 = new Nodo("a");
Nodo nodo3_2 = new Nodo("x");
Nodo nodo3_3 = new Nodo("y");
Nodo nodo3_4 = new Nodo("b");
Nodo nodo3_5 = new Nodo("c");
Nodo nodo3_6 = new Nodo("d");
Nodo nodo3_7 = new Nodo("+");  // ya
Nodo nodo3_8 = new Nodo("+");  // ya
Nodo nodo3_9 = new Nodo("-");  // ya
Nodo nodo3_10 = new Nodo("*");  // ya
Nodo nodo3_12 = new Nodo("/");  // 
Nodo nodo3_13 = new Nodo("+");
Nodo nodo3_14= new Nodo("*");

// Construcción del Árbol C


nodo3_7.izquierdo = nodo3_9;
nodo3_7.derecho = nodo3_8;
nodo3_9.izquierdo = nodo3_1;
nodo3_8.izquierdo = nodo3_2;
nodo3_8.derecho = nodo3_3;
nodo3_12.izquierdo = nodo3_7;
nodo3_12.derecho = nodo3_10;
nodo3_10.izquierdo = nodo3_13;
nodo3_10.derecho = nodo3_14;
nodo3_13.derecho = nodo3_4;
nodo3_14.izquierdo = nodo3_5;
nodo3_14.derecho = nodo3_6;

// Establecer la raíz del árbol C
arbolC.setRaiz(nodo3_12);


// Crear los nodos para el Árbol D
ArbolBinario arbolD = new ArbolBinario();

Nodo nodo4_1 = new Nodo("Esperanza,");
Nodo nodo4_2 = new Nodo("Esperanza,");
Nodo nodo4_3 = new Nodo("Maria,");
Nodo nodo4_4 = new Nodo("Rodrigo,");
Nodo nodo4_5 = new Nodo("Anyora,");
Nodo nodo4_6 = new Nodo("M Jesus,");
Nodo nodo4_7 = new Nodo("Abel,");

// Conectar los nodos 

nodo4_2.izquierdo = nodo4_3;
nodo4_2.derecho = nodo4_4;
nodo4_1.izquierdo = nodo4_2;
nodo4_1.derecho = nodo4_6;
nodo4_6.izquierdo = nodo4_5;
nodo4_6.derecho = nodo4_7;

arbolD.setRaiz(nodo4_1);





        System.out.println("+---------------------------------------------------------------------------------------+");

System.out.println("+---------------------------------------------------------------------------------------+");

System.out.print(" | Preorden:\t"); 
arbolD.recorridoPreorden(arbolD.raiz); 
System.out.print("\t\t");
System.out.println(" |");

System.out.print(" | Enorden:\t"); 
arbolD.recorridoEnorden(arbolD.raiz); 
System.out.print("\t\t");
System.out.println(" |");

System.out.print(" | Postorden:\t"); 
arbolD.recorridoPostorden(arbolD.raiz); 
System.out.print("\t\t");
System.out.println(" |");

System.out.println(" +-------------------------------------------------------------------------------------+");




        System.out.println("+---------------------------------------------------------------------------------------+");
System.out.println("|\t\tArbol A\t\t\tArbol B\t\t\t\tArbol C \t|");
System.out.println("+---------------------------------------------------------------------------------------+");

System.out.print(" | Preorden:\t"); 
arbolA.recorridoPreorden(arbolA.raiz); 
System.out.print("\t\t");
arbolB.recorridoPreorden(arbolB.raiz);
System.out.print("\t\t");
arbolC.recorridoPreorden(arbolC.raiz);  // Recorrido Preorden Árbol C
System.out.println(" |");

System.out.print(" | Enorden:\t"); 
arbolA.recorridoEnorden(arbolA.raiz); 
System.out.print("\t\t");
arbolB.recorridoEnorden(arbolB.raiz);
System.out.print("\t\t");
arbolC.recorridoEnorden(arbolC.raiz);  // Recorrido Enorden Árbol C
System.out.println(" |");

System.out.print(" | Postorden:\t"); 
arbolA.recorridoPostorden(arbolA.raiz); 
System.out.print("\t\t");
arbolB.recorridoPostorden(arbolB.raiz);
System.out.print("\t\t");
arbolC.recorridoPostorden(arbolC.raiz);  // Recorrido Postorden Árbol C
System.out.println(" |");

System.out.println(" +-------------------------------------------------------------------------------------+");

    }
}