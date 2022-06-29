package Ejercicio4Proxy;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements  ICluster{
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<Usuario> usuarios;

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
    }
    public void register(int usuario, String nombre, String nickname, String password){
        usuarios.add(new Usuario(usuario, nombre, nickname, password));
    }

    @Override
    public void brindarAtencion(int usuario, String password) {
        for (Usuario user : usuarios) {
            if (user.getId() == usuario && user.getPassword().equals(password)) {
                int cont = 0;
                for(int i=1; i<=user.getId(); i++){
                    if(user.getId()%i==0){
                        cont++;
                    }
                }
                if (cont<=2) {
                    System.out.println("Numero primo");
                    servidor1.brindarAtencion(usuario, password);
                    user.showInfo();
                } else {
                    System.out.println("No es un numero primo");
                    servidor2.brindarAtencion(usuario, password);
                    user.showInfo();
                }
            }
        }
    }
}
