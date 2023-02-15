
package Ejercicio3;

public class Burbuja implements Ordenacion{
    private int[] vector;
    
    public Burbuja(int[] v){
        vector = v;
    }
    
    @Override
    public void ordena(){
        for(int i = 0; i < vector.length - 1; i++){
            for(int j = vector.length - 1; j > i; j--){
                if(vector[j-1] > vector[j]){
                    int temp = vector[j-1];
                    vector[j-1] = vector[j];
                    vector[j] = temp;
                }
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
