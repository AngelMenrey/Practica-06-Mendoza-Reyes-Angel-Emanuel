//clase usuario
public class Usuario {
    private String usuario, contraseña;
    
    private Usuario siguiente;
    //costructor
    public Usuario() {
        this.usuario = "";
        this.contraseña = "";
        this.siguiente = null;
    }
   // getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }
}

//lista enlazada para usuarios
class Listausers {
    
    private Usuario usuarios;
    //constructor
    public Listausers() {
       usuarios = null;
    }
    //funcion de agregar
     public void agregar(String u, String c){
        Usuario nuevo = new Usuario();
        nuevo.setUsuario(u);
        nuevo.setContraseña(c);
        
        if(usuarios == null){
            usuarios = nuevo;
        }else{
        Usuario aux = usuarios;
        while (aux.getSiguiente()!=null){
            aux= aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        }
    }
    //funcion de recorrerdestinos y comparar datos del usuario y contraseña
     public boolean recorrerDestinos(String u, String c){
     boolean encontrado = false;
     Usuario aux = usuarios;
     if(usuarios == null){
         return  encontrado;
     }else{
         while(aux!=null){
             if(aux.getUsuario().equals(u)&& aux.getContraseña().equals(c)){
                 encontrado = true;
                 break;
         }else{
          encontrado = false;
          }
          aux = aux.getSiguiente();
     }
        return encontrado; 
    }
}
}


    