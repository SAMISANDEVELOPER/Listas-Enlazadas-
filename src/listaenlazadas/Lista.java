package listaenlazadas;

// puntero para saber donde esta el inicio y el fin 
public class Lista {
    private Nodo inicio,fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    // Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    // Metodo para agregar un Nodo al inico de la lista
    public void agregarAlinicio(int num){
        // creo el nodo 
        inicio=new Nodo(num, inicio);
        if (inicio==null){
            fin=inicio;
            
        }
    }
    //Metodo para agregar un Nodo al final de la lista
    public void agregarAlfinal(int num){
        if(!estaVacia()){
            fin.siguiente=new Nodo(num);
            fin=fin.siguiente;
                    
        }else{
            inicio=fin=new Nodo(num);
        }
    }
    //Metodo para Mostrar los Datos 
    
    public void mostrarLista(){
        Nodo recorrer=inicio;
        System.out.println();
        while (recorrer!= null){
            System.out.print("["+recorrer.date+"]------->");
            recorrer=recorrer.siguiente;
        }
        
    }
    // Metodo para buscar el mayor de la lista 
    public void buscarMayorLista (int num){
        if (estaVacia()){
            System.out.println("LA LISTA ESTA VACIA");
        }else{
            Nodo actual =this.inicio;
            int i=0;
            while (actual != null){
                if (actual.date >num ){
                System.out.println("POSICION "+i+"--"+actual.date+"--");}
                i ++;
                actual= actual.siguiente;
            }
        }
    }
    // Metodo para borrar un Nodo en Especifico 
    public void eliminar(int num){
        if (!estaVacia()){
            if(inicio==fin && num==inicio.date){
                inicio=fin=null;
            }else if (num==inicio.date){
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=inicio;
                temporal=inicio.siguiente;
                while(temporal!=null && temporal.date!=num){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }
                if(temporal!=null){
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
                
                
            }
        }
        
    }

    
}