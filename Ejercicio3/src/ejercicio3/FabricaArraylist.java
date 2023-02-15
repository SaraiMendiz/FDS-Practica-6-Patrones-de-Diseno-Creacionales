
package Ejercicio3;

import java.util.ArrayList;


public class FabricaArraylist extends Fabrica{
  private boolean burbuja;
    private int[] vector;
    private ArrayList<Integer> arraylist;
    
    public FabricaArraylist(boolean burbuja,int[] vector){
        this.burbuja = burbuja;
        this.vector = vector;
        arraylist = new ArrayList<Integer>();
    }
    
    @Override
    public Ordenacion crearInstancias(){

        for(int i=0; i < this.vector.length; i++){
            arraylist.add(this.vector[i]);
        }
         Ordenacion vector1;
        if(burbuja){
            vector1 = new BurbujaArrayList((ArrayList<Integer>) arraylist);
        }else{
            vector1 = new SeleccionArrayList((ArrayList<Integer>) arraylist);
        }
        return(vector1);
    }
}
