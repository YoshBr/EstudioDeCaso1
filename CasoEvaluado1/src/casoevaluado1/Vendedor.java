/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author bryan
 */
public class Vendedor {
    // Atributos de vendedor en base al documento

    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean vehiculoPropio;

    // this punto lo de arriba
    public Vendedor(String nombre, String cedula, String codigo, String sucursal, boolean vehiculoPropio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculoPropio = vehiculoPropio;
    }

    // Ponemos estos datos en Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isVehiculoPropio() {
        return vehiculoPropio;
    }

    public void setVehiculoPropio(boolean vehiculoPropio) {
        this.vehiculoPropio = vehiculoPropio;
    }

    int getmes() {
        int mes = 0;
        return mes;
    }

}
