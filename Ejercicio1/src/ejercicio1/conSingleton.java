
package Ejercicio1;

public class conSingleton {
    private int x,y;
    private static conSingleton uniqueInstance;
    
    private conSingleton(){}
    
    public static conSingleton getInstance(){
        if(uniqueInstance == null)
        uniqueInstance = new conSingleton();
        return uniqueInstance;
    }
    
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
