/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }
/**
 * addProducto: Añade un producto a la lista
 * @param prod
 * @return 
 */
    //No implementados los cambios del punto 4
    public Producto addProducto(Producto prod) {
        
         if (prod.getcode() == null) {
             
             System.out.println("Error, cadena vacía");
             return null;
         }
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }
/**
 * eliminarProducto: Elimina un producto de la lista
 * @param codigo
 * @return 
 */
    public Producto eliminarProducto(String codigo) { 
        
           if (codigo == null) {
             
             System.out.println("Error, cadena vacía");
             return null;
         }
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }
/**
 * buscarProducto: Busca un producto de la lista
 * @param codigo
 * @return 
 */
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
          if (codigo == null) {
             
             System.out.println("Error, cadena vacía");
             return null;
         }
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * getProductos: Muestra una lista con los productos en ella
 * @return 
 */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
 /**
  * totalProductos: Devuelve el número total de productos de la lista
  * @return 
  */   
    public int totalProductos(){
            return this.getN();
    }
}
