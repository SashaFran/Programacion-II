package facturacion;

public class EmpleadoExtra extends Empleado{
	
	
	
	private Double porcentaje; //porcentaje por venta
	private int cantVentas;
	
	public EmpleadoExtra(String nombre, String apellido, int DNI, int sueldoFijo, int cantVentas) {
		super(nombre, apellido, DNI, sueldoFijo);
		this.cantVentas = cantVentas;
	}

	@Override
	public Double getSueldoMensual() {
		double suma = super.getSueldoFijo()*getPorcentaje();
		
		return (suma + super.getSueldoFijo());		
	}
	
	public Double getPorcentaje() {
		if ((cantVentas > 0)&&(cantVentas < 5)){
			porcentaje = 0.5;
		}else if(cantVentas > 5){
			porcentaje = 0.10;
		}
		return porcentaje;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String mostrar() {
		return "Nombre: "+super.getNombre()+" Apellido: "+super.getApellido()+"\nSalario mensual: "+this.getSueldoMensual();
	}
	
	public String toString(){
		return "Empleado por comision: "+super.getSueldoFijo()+"\nCantidad de ventas: "+this.getCantVentas()+"\nPorcentaje por venta: "+this.getPorcentaje();
	}

	}
	
	
	


