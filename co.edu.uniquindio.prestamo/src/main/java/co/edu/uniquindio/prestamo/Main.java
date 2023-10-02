package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.PrestamoUq;
import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;
import co.edu.uniquindio.prestamo.model.Objeto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PrestamoUq prestamoUq = inializarDatosPrueba();

        //CRUD
        // Create
        crearCliente("juan", "arias", "1094", 24, prestamoUq);
        crearCliente("ana", "alzate", "1095", 35, prestamoUq);
        crearCliente("maria", "perez", "1096", 22, prestamoUq);
        crearCliente("pedro", "arias", "1097", 24, prestamoUq);

        crearEmpleado("wilder", "reyes", "1234", 21, prestamoUq);
        crearEmpleado("juan", "peres", "1239", 22, prestamoUq);
        crearEmpleado("walter", "reinosa", "1237", 29, prestamoUq);
        crearEmpleado("andrea", "rojas", "1235", 26, prestamoUq);

        //Read
        mostrarInformacionCliente(prestamoUq);
        //mostrarInformacionEmpleado(prestamoUq);

        //Update
        actualizarCliente(prestamoUq);


        //Delete
        eliminarCliente(prestamoUq, "1094");
        System.out.println("-----> Informacion luego de eliminar");

        mostrarInformacionCliente(prestamoUq);

        // System.out.println("-----> lista empleados");

        // mostrarInformacionEmpleado(prestamoUq);
    }

    private static void actualizarCliente(PrestamoUq prestamoUq) {

    }

    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      String cedula,
                                      int edad,
                                      PrestamoUq prestamoUq) {
        prestamoUq.crearEmpleado(nombre, apellido, cedula, edad);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanioLista = listaClientes.size();
        for (int i = 0; i < tamanioLista; i++) {
            Cliente cliente = listaClientes.get(i);

            System.out.println(cliente.toString());
        }
    }

    private static void mostrarInformacionEmpleado(PrestamoUq prestamoUq) {
        List<Empleado> listaEmpleado = prestamoUq.obtenerEmpleado();
        int tamanioLista = listaEmpleado.size();
        for (int i = 0; i < tamanioLista; i++) {
            Empleado empleado = listaEmpleado.get(i);

            System.out.println(empleado.toString());
        }
    }

    private static void eliminarCliente(PrestamoUq prestamoUq, String cedula) {

        prestamoUq.eliminarCliente(cedula);
    }
}