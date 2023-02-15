
package Ejercicio3;

import java.util.ArrayList;


public class BurbujaArrayList implements Ordenacion{
    
    ArrayList<Integer> vector = new ArrayList<Integer>();
    
    public BurbujaArrayList(ArrayList<Integer> arraylist){
        vector = arraylist;
    }
    
    @Override
    public void ordena(){
        for(int i = 0; i < vector.size() - 1; i++){
            for(int j = vector.size() - 1; j > i; j--){
                if(vector.get(j-1) > vector.get(j)){
                    int temp = vector.get(j-1);
                    vector.add(j,this.vector.get(j+1));
                    vector.add(j+1,temp);
                }
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
