package Tienda;

public class Productos implements CargaDatos{
    int id_producto=0;
    int    cantidad;
    int     total;
    boolean estado;

    public Productos() {

    }
    public Productos(int cantidad, int total, boolean estado) {
        this.cantidad = cantidad;
        this.total = total;
        this.estado = estado;
    }




    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //metodos
    public void Metodo(){
        //mrtodo vacio
    };

    @Override
    public void IngresarDatos() {
        Productos nuevo_producto = new Productos();
        System.out.println("se ingresa un nuevo producto");

    }

    @Override
    public void ConsularDatos() {
        System.out.println("aca se debe colocar un scanner para preguntar por que quiere consultar");


    }
}
