
package Ejercicio3;

public abstract class Fabrica {
    public Ordenacion ordena(){
        Ordenacion orden = crearInstancias();
        orden.ordena();
        return orden;
    }
    public Ordenacion imprime(){
        Ordenacion orden = crearInstancias();
        orden.imprime();
        return orden;
    }
    public abstract Ordenacion crearInstancias();
}
