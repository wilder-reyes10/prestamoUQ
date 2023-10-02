package co.edu.uniquindio.prestamo;
import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.util.CapturaDatosUtil;
import co.edu.uniquindio.prestamo.model.PrestamoUq;
import java.util.Scanner;


public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion = 0;

            do{
                System.out.println("MENU DE OPCIONES");
                System.out.println("1 Crear");
                System.out.println("2 Leer");
                System.out.println("3 Actualizar");
                System.out.println("4 Eliminar");
                System.out.println("5 Salir");

                System.out.println("Digite la opcion");

                opcion = scanner.nextInt();

                switch (opcion) {

                case 1:
                    crearCliente();
                    break;
                case 2:
                    leerCliente();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    salir();
                    break;
            }
        } while (opcion != 5) ;


    }

    public static void crearCliente(){

        System.out.println("nombre");
            String nombreCliente = scanner.next();

        System.out.println("apellido");
            String apellidoCliente = scanner.next();

        System.out.println("cedula");
            String cedulaCliente= scanner.next();

        System.out.println("edad");
            int edadCliente= scanner.nextInt();

        String clienteCreado = nombreCliente + "-" + apellidoCliente + "-" + cedulaCliente+ "-"  + edadCliente;
        System.out.println("cliente creado "+clienteCreado);

    }

    public static void leerCliente(){

    }

    public static void actualizarCliente(){

    }

    public static void eliminarCliente(){

    }

    public static void salir(){

    }

}
