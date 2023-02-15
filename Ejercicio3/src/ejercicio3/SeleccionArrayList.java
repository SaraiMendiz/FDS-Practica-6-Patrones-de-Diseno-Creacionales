
package Ejercicio3;

import java.util.ArrayList;


public class SeleccionArrayList implements Ordenacion{
     ArrayList<Integer> vector = new ArrayList<Integer>();
     
     public SeleccionArrayList(ArrayList<Integer> arraylist){
        vector = arraylist;
    }
     
      @Override
     public void ordena(){
    int m;
        for(int i = 0; i < vector.size() - 1; i++){
            m = i;
            for(int j = i+1; j < vector.size(); j++){
                if(vector.get(j) < vector.get(m)){
                    m = j;
                }
                int aux = vector.get(i);
                vector.add(i,vector.get(m));
                vector.add(m,aux);
            }
        }
    }
     @Override
    public void imprime(){
        for(int i = 0; i < vector.size(); i++){
            System.out.print(vector.get(i)+" ");
        }
    }
}
