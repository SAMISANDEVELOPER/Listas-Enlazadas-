
package listaenlazadas;


public class Nodo {
public int date;
    public Nodo anterior;
    public Nodo temporal;
    public Nodo siguiente;//Puntero del Enlace
    public Nodo(int d){// nodo al final solamente
    date = d ;
}
    // este constructor ayuda a insertar al inicio de la lista
    public Nodo(int d,Nodo n){
        date = d;
        siguiente=n;
    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}