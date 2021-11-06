

package listaenlazadas;

import java.util.Scanner;

public class ListaEnlazadas {
private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    Lista listita =new Lista();
    int opcion=0,num = 0;

       while(opcion != 5){
            System.out.println("1-Agregue un numero a la lista\n");
            System.out.println("2-mostar Lista\n");
            System.out.println("3-mostrar segun valor y posicion\n");
            System.out.println("4-borrar segun rango determinado\n");
            System.out.println("5-salir\n");
            System.out.println("*************************************************************");
            opcion = entrada.nextInt();
            
                                    
            switch (opcion){
                case 1:
                    
                    System.out.println("INGRESE UN NUMERO");
                    num = entrada.nextInt();
                    if(num>=50){
                       listita.agregarAlinicio(num);
                        System.out.println(num);
                    }else{
                        listita.agregarAlfinal(num);
                        System.out.println(num);
                  }
                     
                    break;
                case 2:
                listita.mostrarLista();
                    System.out.println("****************************************");
                   
                    break;
                case 3:
                    listita.buscarMayorLista(num);
                    
                    break;
                case 4:
                    System.out.println("indique el  rango a borrar\n"); 
                    num = entrada.nextInt();
                    listita.eliminar(num);
                    break;
                case 5:
                    System.out.println("salir");    
                    break;
                default:System.out.println("INGRESE UNA OPCION VALIDA");
                    break;
            }
                
        }
    }
}
