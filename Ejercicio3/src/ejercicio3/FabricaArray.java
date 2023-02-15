
package Ejercicio3;

public class FabricaArray extends Fabrica{    
    
    private boolean burbuja;
    private int[] vector;
    
    public FabricaArray(boolean burbuja,int[] vector){
        this.burbuja = burbuja;
        this.vector = vector;
    }
    
    
    @Override
    public Ordenacion crearInstancias() {
        Ordenacion vector1;
        if(burbuja){
            vector1 = new Burbuja(vector);
        }else{
            vector1 = new Seleccion(vector);
        }
        return(vector1);
    }
}
