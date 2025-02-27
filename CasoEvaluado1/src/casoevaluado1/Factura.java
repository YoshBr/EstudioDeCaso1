/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1;

/**
 *
 * @author bryan
 */
public class Factura {
    // Atributos de la clase facturaa
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double montoFactura;
    private int mes;
    private int productosElectricos;
    private int productosAutomotrices;
    private int productosConstruccion;

    // this punto, de los private de arriba
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double montoFactura, int mes,
            int productosElectricos, int productosAutomotrices, int productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }

    // Ahora ponemos estos datos en Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(int productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public int getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(int productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public int getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(int productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
}
