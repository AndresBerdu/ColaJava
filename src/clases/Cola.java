package clases;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicioCola;
    private Nodo finalCola;
    String cola = "";

    public Cola() {
        inicioCola = null;
        finalCola = null;
    }

    //Metodo para saver si la cola esta vacia
    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para insertar a la cola
    public void insertar(int informacion) {

        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.infomacion = informacion;
        nuevo_nodo.siguente = null;

        if (colaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }

    //Metodo para extraer de la cola
    public int extraer() {
        if (!colaVacia()) {
            int informacion = inicioCola.infomacion;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Metodo para mostra el contenido de la cola
    public void mostrarContenido() {
        
        Nodo recorrido = inicioCola;
        String colaInvertida = "";
        
        while (recorrido != null) {            
            cola += recorrido.infomacion + " ";
            recorrido = recorrido.siguente;
        }
        
        String cadena[] = cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        cola = "";
    }
}
