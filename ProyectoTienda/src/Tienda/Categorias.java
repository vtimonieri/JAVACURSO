package Tienda;

public class Categorias implements CargaDatos{
    int  id_categoria=0;
    String descripcion;
    Boolean estado;

    public Categorias() {
        id_categoria++;
    }

    public Categorias(String descripcion, Boolean estado) {

        this.descripcion = descripcion;
        this.estado = estado;
    }





    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    //metodos
    public void metodo(){
        //metodo vacio
    }

    @Override
    public void IngresarDatos() {
        Categorias nueva_categoria = new Categorias();
        System.out.println("se ingresa una nueva categorìa");

    }

    @Override
    public void ConsularDatos() {
        System.out.println("aca se debe colocar un scanner para preguntar por que quiere consultar");

    }
}
