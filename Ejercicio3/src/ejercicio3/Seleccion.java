
package Ejercicio3;

public class Seleccion implements Ordenacion{
    private int[] vector;
    
    public Seleccion(int[] v){
        vector = v;
    }    
    @Override
    public void ordena(){
    int m;
        for(int i = 0; i < vector.length - 1; i++){
            m = i;
            for(int j = i+1; j < vector.length; j++){
                if(vector[j] < vector[m]){
                    m = j;
                }
                int aux = vector[i];
                vector[i] = vector[m];
                vector[m] = aux;
            }
        }
    }
    @Override
    public void imprime(){
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i]+" ");
        }
    }
}
