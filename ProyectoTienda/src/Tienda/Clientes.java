package Tienda;

public class Clientes extends Personas implements CargaDatos{
    int Id=0;

    public Clientes() {
     Id++;
    }

    public Clientes(String nombre, String apellidos, int celular, String direccion, String email) {
        super(nombre, apellidos, celular, direccion, email);

    }


    @Override
    public void IngresarDatos() {
        Clientes nuevo_cliente = new Clientes();
        System.out.println("se ingresa un nuevo cliente");
            }

    @Override
    public void ConsularDatos() {
        System.out.print("se consultan datos de nuevos clientes");
        System.out.println("aca se debe colocar un scanner para preguntar por que quiere consultar");
    }
}


