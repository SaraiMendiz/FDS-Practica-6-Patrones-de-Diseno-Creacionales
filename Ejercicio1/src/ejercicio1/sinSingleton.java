
package Ejercicio1;

public class sinSingleton {
    private int x,y;
    
    public sinSingleton(){}
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String getInformacion(){
        return "Valor de X = "+x+" Valor de Y = "+y;
    }
}
