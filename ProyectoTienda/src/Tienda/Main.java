package Tienda;


public class Main {

    public static void main(String[] args) {

        Clientes nuevo_cliente  = new Clientes();
        //System.out.println(cliente1);

        Clientes cliente2 = new Clientes("aldo","rios", 111,"dorrego 124", "ruos@gmail.com");

        System.out.println(cliente2);
        nuevo_cliente.IngresarDatos();
        nuevo_cliente.ConsularDatos();

        Productos producto1 = new Productos();
       System.out.println(producto1);


        Categorias nueva_categoria = new Categorias();
        System.out.println(nueva_categoria);
        nueva_categoria.IngresarDatos();
        nueva_categoria.ConsularDatos();

        Compras compra = new Compras();
            System.out.print("compra");


    }


    }
