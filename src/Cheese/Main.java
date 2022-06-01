/*
*	grupo  : GDAM
*	alumno : Alfonso Caballero Alvarez
*	n.exp. : 7232
*	fecha  : 01/06/2022
        //VERSIÓN FINAL
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         Producto primero = new Producto("1","Cabra",12,10);
         Producto segundo = new Producto("2","Vaca",10,8);
         ListaProductos L = new ListaProductos();
         L.addProducto(primero);
         L.addProducto(segundo);
         primero.imprime_etiqueta();
         segundo.imprime_etiqueta();
         System.out.println("LISTA DE PRODUCTOS");
         System.out.println(L.getProductos());
             
         }
   }

