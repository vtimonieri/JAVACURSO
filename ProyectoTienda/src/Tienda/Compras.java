package Tienda;
import java.util.Date;

public class Compras {
   int id_compra=0;
   Date fecha;
   Character medio_pago;
   String comentario;
   Character estado;

    public Compras() {
    id_compra++;
    }

    public Compras(Date fecha, Character medio_pago, String comentario, Character estado) {
        this.fecha = fecha;
        this.medio_pago = medio_pago;
        this.comentario = comentario;
        this.estado = estado;
    }





    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(Character medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }
    //metodo

    public void metodo(){
        //metodo vacio
    }


}
