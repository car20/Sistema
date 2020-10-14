
package Clases;


public class Factura extends Producto {
    public int nFactura;
    public String fecha;
    public int cantidad;
    public double precio;
    
    public Factura(String codigo, String nombre,
            double precio, int nFactura, String fecha,  int cantidad) {
        super(codigo, nombre);
        this.nFactura = nFactura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getnFactura() {
        return nFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
