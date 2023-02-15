
package Ejercicio2;

public class usuario {
    private String password;
    private String name;
    
    public usuario(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    public String getName(){
        return name;
    }
    
    public String getInformacion(){
        return "Nombre del usuario: "+name+"\n"+"Contraseña del usuario: "+password;
    }
    public boolean comprobar(Object user){
        return(this.getName().equals(((usuario) user).getName()) && this.getPassword().equals(((usuario) user).getPassword()));
    }
}
