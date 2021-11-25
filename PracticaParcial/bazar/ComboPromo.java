package bazar;

import bazar.Criterio.Criterio;

public class ComboPromo extends Compuesto {

	public ComboPromo(String nombre, double descuentoTope, double porcentajeProd, Criterio c) {
		super(nombre, descuentoTope, porcentajeProd, c);
	}
	
	public double getPrecio(){
		double precio = this.precioSinDescuento();
		return precio / this.cantidadProductos();
	}

}
