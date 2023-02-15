
package Ejercicio2;

import java.util.ArrayList;

public class sinSingleton {
    private ArrayList<usuario> usuarios;
    
    public sinSingleton(){
        usuarios = new ArrayList<>();
    }
    
    public void addUser(String name, String password){
        usuario u = new usuario(name, password);
        boolean inexistente = true;
        
        for(usuario i : usuarios){
            if(i.getName().equals(u.getName())){
                inexistente = false;
                System.out.println("Este usuario ya existe");
            }
        }
        if(inexistente){
            usuarios.add(u);
            System.out.println("Usuario añadido");
        }
    }
    public void imprimir(){
        for(usuario u : usuarios){
            System.out.println(u.getInformacion()+"\n");
        }
    }
}


