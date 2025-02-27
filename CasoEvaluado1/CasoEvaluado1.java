/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1;


import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Solicitar datos del agente vendedor:
        // Nombre del agente, numero de cedula, su codigo, sucursal a la que pertenece, indicar si tiene o no vehiculo propio..
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente vendedor:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente vendedor:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente vendedor:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal a la que pertenece el agente vendedor:");
        boolean vehiculoPropio = JOptionPane.showConfirmDialog(null, "¿El agente vendedor tiene vehículo propio?") == 0;

        // creamos vendedor new
        Vendedor agente = new Vendedor(nombre, cedula, codigo, sucursal, vehiculoPropio);

        // Variables para las calculaciones de facturas, comisiones, puntos y facruras del mes...
        double totalFacturas = 0;
        double totalComisiones = 0;
        int totalPuntos = 0;
        int totalFacturasMes = 0;

        // Solicitamos los datos de las facturas:
        // nombre, cedula, codigo, monto de la factura, mes, y prod.. elec, auto,,const
        boolean continuar = true;
        while (continuar) {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mes entre (1-12):"));
            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos eléctricos:"));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:"));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construcción:"));

            // Creamos Factura new
            Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, montoFactura, mes, productosElectricos, productosAutomotrices, productosConstruccion);

            // Procedemos a calcular las comisiones y puntos
            double comision = 0;
            int puntos = 0;

            // si la factura posee los tres tipos de productos tendra un bono de 10% de la factura no se -
            // le podra agregar otro bono solo el del monto de factura a 50000. Esto sumara 3 puntos al vendedor.
            if (factura.getProductosElectricos() > 0 && factura.getProductosAutomotrices() > 0 && factura.getProductosConstruccion() > 0) {
                comision += factura.getMontoFactura() * 0.10;
                puntos += 3;
            } else {
                // si la factura contiene productos electronicos mayor o igual a 3 tendra un bono de 4% si no 2%. Esto sumara 1 punto al vendedor.
                if (factura.getProductosElectricos() >= 3) {
                    comision += factura.getMontoFactura() * 0.04;
                } else {
                    comision += factura.getMontoFactura() * 0.02;
                }
                puntos += 1;

                // Si la factura contiene productos automotrices mayor a 4 tendra un bono de 4% si no 2%. Esto sumara 1 punto al vendedor.
                if (factura.getProductosAutomotrices() > 4) {
                    comision += factura.getMontoFactura() * 0.04;
                } else {
                    comision += factura.getMontoFactura() * 0.02;
                }
                puntos += 1;

                // Si la factura contiene productps contruccion tendra bono del 8%. Esto sumara 2 puntos al vendedor.
                if (factura.getProductosConstruccion() > 0) {
                    comision += factura.getMontoFactura() * 0.08;
                    puntos += 2;
                }
            }

            // Ultimo bono, si la factura tiene un monyo mayor a 50000 se agregara un 5% al total de la factura. Esto sumara 1 punto al vendedor.
            if (factura.getMontoFactura() > 50000) {
                comision += factura.getMontoFactura() * 0.05;
                puntos += 1;
            }

            totalFacturas += factura.getMontoFactura();
            totalComisiones += comision;
            totalPuntos += puntos;
            totalFacturasMes++;

            // Solicitamos - preguntamos al sistema si desea agregar otra factura
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra factura?") == 0;
        }

        // Verificamos el bono extra
        boolean bonoExtra = (totalFacturasMes > 3) || (totalFacturas > 300000);
        if (bonoExtra) {
            totalComisiones += 20000;
        }
        // Procedemos a mostrar todo los resultados del caso
        String mensaje = "El Agente Vendedor " + agente.getNombre() + " código: " + agente.getCodigo() + "\n"
                + "Vendió un total de " + totalFacturas + " en facturas.\n"
                + "Obtuvo un total en comisiones de " + totalComisiones + ".\n"
                + (bonoExtra ? "El agente vendedor logró el objetivo de llegar al BONO EXTRA.\n" : "El agente vendedor no logró el objetivo de llegar al BONO EXTRA.\n")
                + "Puntos obtenidos por el vendedor: " + totalPuntos + ".\n"
                + "El Agente Vendedor " + (agente.isVehiculoPropio() ? "si" : "no") + " cuenta con vehículo propio.\n"
                + "Sucursal: " + agente.getSucursal() + ".\n";
    }
}

