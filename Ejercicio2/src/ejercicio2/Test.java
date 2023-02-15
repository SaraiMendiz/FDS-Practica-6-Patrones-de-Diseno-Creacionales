
package Ejercicio2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0,opcion2 = 0;
        do{
            System.out.println("Bienvenido");
            System.out.println("0º- Salir");
            System.out.println("1º- Realizar pruebas");
            System.out.println("2º- Realizar Login");
            opcion = sc.nextInt();
            String name,password;
            
            switch (opcion){
                case 0: break;
                
                case 1: System.out.println("Prueba sin Singleton:");
                        System.out.println("Añadiremos al usuario Alan");
                        sinSingleton u1 = new sinSingleton();
                        u1.addUser("Alan","Alan123");
                        u1.imprimir();
                        System.out.println("Añadiremos un nuevo usuario llamado Charles");
                        u1.addUser("Charles","Babbage123");
                        u1.imprimir();
                        System.out.println("Añadiremos un usuario repetido, Alan");
                        u1.addUser("Alan","Turing123");
                        System.out.println("Añadiremos un nuevo usuario llamado Joe");
                        u1.addUser("Joe","MacMillan321");
                        u1.imprimir();
                        
                        System.out.println("Añadiremos un nuevo usuario llamado Steve");
                        sinSingleton u2 = new sinSingleton();
                        u2.addUser("Steve","Jobs123");
                        u2.imprimir();
                        
                        
                        
                        System.out.println("\n================================================\n");
                        System.out.println("Prueba con Singleton:");
                        System.out.println("Añadiremos a la usuario Ada");
                        conSingleton us1;
                        us1 = conSingleton.getInstance();
                        us1.addUser("Ada","Lovelace123");
                        us1.imprimir();
                        
                        System.out.println("Añadiremos a un nuevo usuario llamado John");
                        us1 = conSingleton.getInstance();
                        us1.addUser("John", "John123");
                        us1.imprimir();
                        
                        System.out.println("No añadiremos nada");
                        us1 = conSingleton.getInstance();
                        us1.imprimir();
                        
                        System.out.println("Trataremos de crear un nuevo objeto con el usuario llamado Gordon");
                        conSingleton us2;
                        us2= conSingleton.getInstance();
                        us2.addUser("Gordon", "Freeman123");
                        us2.imprimir();
                        break;
                        
                case 2: System.out.println("1º-Iniciar sesión");
                        System.out.println("2º-Registrarse");
                        opcion2 = sc.nextInt();
                        switch (opcion2){
                            case 1: System.out.println("Nombre: ");
                                    name = sc.nextLine();
                                    System.out.println("Contraseña: ");
                                    password = sc.nextLine();
                                    conSingleton usuario1;
                                    usuario1 = conSingleton.getInstance();
                                    usuario1.iniciarSesion(name,password);
                                    break;
                            case 2: System.out.println("Nombre: ");
                                    name = sc.nextLine();
                                    System.out.println("Contraseña: ");
                                    password = sc.nextLine();
                                    conSingleton usuario2;
                                    usuario2 = conSingleton.getInstance();
                                    usuario2.addUser(name,password);
                                    break;
                            default: System.out.println("Numero incorrecto");
                        }
                        break;
                        
                default: System.out.println("Numero incorrecto");
            }   
        }while(opcion != 0);
    }
}
