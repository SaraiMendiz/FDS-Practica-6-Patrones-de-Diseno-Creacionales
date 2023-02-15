
package Ejercicio2;

import java.util.ArrayList;

public class conSingleton {
    private static conSingleton instance;
    private ArrayList<usuario> usuarios;
    
    public conSingleton(){
        usuarios = new ArrayList<>();
    }
    
    public static conSingleton getInstance(){
        if(instance == null) 
            instance = new conSingleton();
        return instance;
    }
    
    public void addUser(String name, String password){
        usuario u = new usuario(name, password);
        boolean inexistente = true;
        
        for(usuario i : usuarios){
            if(u.getName().equals(u.getName())){
                inexistente = false;
                System.out.println("Este usuario ya existe");
            }
        }
        if(inexistente){
            usuarios.add(u);
            System.out.println("Usuario añadido");
        }
    }
    
    public void iniciarSesion(String name, String password){
        usuario u = new usuario(name, password);
        boolean encontrado = false;
        if(usuarios.isEmpty())
            System.out.println("El usuario no está registrado");
        for(usuario i : usuarios){
            if(i.equals(u)){
                System.out.println("Bienvenido: "+u.getName());
                        encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Usuario no registrado");
        }
    }
    public void imprimir(){
        for(usuario u : usuarios){
            System.out.println(u.getInformacion()+"\n");
        }
    }
}
