
package Ejercicio1;

public class Test {
    public static void main(String[] args){
        System.out.println("Punto sin Singleton:");
        System.out.println("Creamos el Punto 1 (P1)");
        sinSingleton p1 = new sinSingleton();
        p1.setX(4);
        p1.setY(4);
        System.out.println("Información "+p1.getInformacion());
        
        System.out.println("Creamos un nuevo Punto P1 sin Singleton:");
        p1 = new sinSingleton();
        p1.setX(7);
        p1.setY(3);
        System.out.println("Información "+p1.getInformacion());
        
        System.out.println("Creamos un nuevo Punto P2 sin Singleton:");
        sinSingleton p2 = new sinSingleton();
        System.out.println("Información: "+p2.getInformacion());
        System.out.println("Ahora les asignamos valores");
        p2.setX(1);
        p2.setY(2);
        System.out.println("Información "+p2.getInformacion());
        
        System.out.println("\n========================================\n");
        System.out.println("Punto con Singleton: ");
        System.out.println("Creamos el Punto 1 (P1)");
        conSingleton sp1;
        sp1 = conSingleton.getInstance();
        sp1.setX(3);
        sp1.setY(3);
        System.out.println("Información "+sp1.getInformacion());
        System.out.println("Ahora cambiaremos los valores del Punto 1 (P1)");
        sp1.setX(8);
        sp1.setY(7);
        System.out.println("Información "+sp1.getInformacion());
        System.out.println("Ahora probaremos crear una nueva instancia");
        conSingleton sp2;
        sp2 = conSingleton.getInstance();
        System.out.println("Imprimiremos su información sin haber asignado ningún nuevo valor y veremos que tiene los mismos el P1");
        System.out.println("Información "+sp2.getInformacion());
        
        
    }
}
