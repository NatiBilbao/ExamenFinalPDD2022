package Ejercicio4Proxy;

public class Usuario {
    private int id;
    private String nombre;
    private String nickname;
    private String password;

    public Usuario(int numUsuario, String nombre, String nickname, String password){
        this.id =numUsuario;
        this.nombre=nombre;
        this.nickname=nickname;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo(){
        System.out.println("Numero de usuario: "+ id);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Nickname: "+ nickname);
        System.out.println("Contrasena: "+ password);
        System.out.println();
    }
}
