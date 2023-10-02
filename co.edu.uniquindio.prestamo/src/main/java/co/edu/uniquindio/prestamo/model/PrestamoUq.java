package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {

    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleado = new ArrayList<>();

    // Constructot sin parametros
    public PrestamoUq() {
    }

    // Constructor con parametros
    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {

        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {

        this.listaClientes = listaClientes;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    /**
     * Metodo para crear un cliente
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);

        return true;
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     *
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {

        return getListaClientes();
    }

    public List<Empleado> obtenerEmpleado() {

        return  getListaEmpleado();
    }

    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaClientes().size();
        for (int i = 0; i < tamanioLista; i++) {
            Cliente cliente = getListaClientes().get(i);
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                getListaClientes().remove(i);
                break;
            }
        }
    }

    /**
     * Metodo para crear un empleado
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearEmpleado(String nombre, String apellido, String cedula, int edad) {
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setEdad(edad);
        getListaEmpleado().add(empleado);

        return true;
    }

    public void actualizarCliente( Cliente ListaCliente) {

    }

    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
