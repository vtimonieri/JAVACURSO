package Tienda;

public abstract class Personas {
    //atributos de la clase

    private String nombre;
    private String apellidos;
    private int celular;
    private String direccion;
    private String email;


    //creo el constructor vacio para instanciar
    public Personas() {
    }

    public Personas(String nombre, String apellidos, int celular, String direccion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodos de la clase


    //public abstract void ingresarDatos();




}
