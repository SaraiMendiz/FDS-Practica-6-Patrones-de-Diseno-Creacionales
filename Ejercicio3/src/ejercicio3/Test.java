
package Ejercicio3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
         int opcion = 0;
         boolean b = false;
         boolean c = false;
         
         System.out.println("Fábrica Estática");
         do{
              System.out.println("Introduzca tamaño del vector: ");
              int size = sc.nextInt();
              int[] v = new int[size];
              for(int i = 0; i < size; i++){
                  System.out.println("Introduzca elemento "+i+":");
                  v[i] = sc.nextInt();
              }
              System.out.println("0º- Salir");
              System.out.println("1º- Ordenar por Burbuja");
              System.out.println("2º- Ordenar por Selección");
              opcion = sc.nextInt();
              switch (opcion){
                  case 0: break;
                  case 1: b = true;
                        Fabrica fabrica = new FabricaArray(b,v);
                        fabrica.ordena();
                        fabrica.imprime();
                        opcion = 0;
                        break;    
                  case 2: b = false;
                        Fabrica fabrica2 = new FabricaArray(b,v);
                        fabrica2.ordena();
                        fabrica2.imprime();
                        opcion = 0;
                        break;                        
                  default: System.out.println("Valor no válido");
                  break;
              }                          
              
         }while(opcion != 0);
         System.out.println("\n==============================================\n");
         System.out.println("Fábrica Dinámica");
         do{
              System.out.println("Introduzca tamaño del vector: ");
               int size2 = sc.nextInt();
              int[] v2 = new int[size2];
              for(int i = 0; i < size2; i++){
                  System.out.println("Introduzca elemento "+i+":");
                  v2[i] = sc.nextInt();
              }
              System.out.println("0º- Salir");
              System.out.println("1º- Ordenar por Burbuja");
              System.out.println("2º- Ordenar por Selección");
              opcion = sc.nextInt();
              switch (opcion){
                  case 0: break;
                  case 1: c = true;
                        Fabrica fabrica3 = new FabricaArraylist(c,v2);
                        opcion = 0;
                        fabrica3.ordena();
                        fabrica3.imprime();
                        break;    
                  case 2: c = false;
                        Fabrica fabrica4 = new FabricaArraylist(c,v2);
                        fabrica4.ordena();
                        fabrica4.imprime();
                        opcion = 0;
                        break;
                  default: System.out.println("Valor no válido");
                  break;
              }                          
              
         }while(opcion != 0);
    }
}
