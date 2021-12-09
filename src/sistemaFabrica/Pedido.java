package sistemaFabrica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Pedido {

	private Mueble mueble;
	private LocalDate fechaPedido, fechaMaxima;
	private String direccionEntrega;
	private ArrayList<Fabrica> fabricas;
	
	
	public Pedido(Mueble mueble, LocalDate fechaPedido, LocalDate fechaMaxima, String direccionEntrega) {
		super();
		this.mueble = mueble;
		this.fechaPedido = fechaPedido;
		this.fechaMaxima = fechaMaxima;
		this.direccionEntrega = direccionEntrega;
		this.fabricas = new ArrayList<>();
	}
	
	public void tomaPedido(ArrayList<Pedido> muebles, Comparator<Mueble> cm){
        for(Pedido m: muebles){
            boolean aceptada = false;
            int i = 0;
            while (i<fabricas.size() && !aceptada){
                Fabrica f = fabricas.get(i);
                if (f.aceptas(m)){
                    f.tomaPedido(m);
                    aceptada = true;
                }
                i++;
            }
            if (!aceptada)
                rechazoPedido(m);
        }
	}
	
	public String rechazoPedido(Pedido m){
		return "Pedido "+ m +" rechazado";
	}
	
	
	public void addFabrica(Fabrica f){
		fabricas.add(f);
	}

	public Mueble getMueble() {
		return mueble;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public LocalDate getFechaMaxima() {
		return fechaMaxima;
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public ArrayList<Fabrica> getFabricas() {
		return new ArrayList<Fabrica>(fabricas);
	}
	
	
	
	
	
	
}
