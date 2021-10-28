package workBreakDown;


import java.time.LocalDate;
import java.util.ArrayList;

public class Tareaterminal extends ElementTarea{
	private LocalDate fechainicioReal;
	private LocalDate fechafinReal;
	private ArrayList<Recurso>recursos;
	private boolean enespera;
	private  boolean enproceso;
	private boolean secompleto;
	
	
	
	public Tareaterminal(String nombre,LocalDate fechainiEstimada,LocalDate fechafinEstimada) {
		super(nombre);
		this.setFechaInicio(fechainiEstimada);
		this.setFechafin(fechafinEstimada);
		this.recursos= new ArrayList<>();
		
		
	}
	
	public void asignarRecurso(Recurso r) {
		if (!recursos.contains(r))
			if (this.SepuedeasignarRecurso(r)) {
				r.asignarleTarea(this);
				recursos.add(r);
			}
	}

	public LocalDate getFechainicioReal() {
		return fechainicioReal;
	}

	public void setFechainicioReal(LocalDate fechainicioReal) {
		this.fechainicioReal = fechainicioReal;
	}

	public LocalDate getFechafinReal() {
		return fechafinReal;
	}

	public void setFechafinReal(LocalDate fechafinReal) {
		this.fechafinReal = fechafinReal;
	}

	public boolean isEnespera() {
		return enespera;
	}

	public void setEnespera(boolean enespera) {
		this.enespera = enespera;
	}

	public boolean isEnproceso() {
		return enproceso;
	}

	public void setEnproceso(boolean enproceso) {
		this.enproceso = enproceso;
	}

	public boolean isSecompleto() {
		return secompleto;
	}

	public void setSecompleto(boolean secompleto) {
		this.secompleto = secompleto;
	}
	
	
	public ArrayList<ElementTarea>listatareasRecurso(Recurso r){
		ArrayList<ElementTarea>aux= new ArrayList<>();
		if (recursos.contains(r)){
			aux.add(this);
		}
		return aux;
		
	}
	
	

	public ArrayList<Recurso> getRecursos() {
		return recursos;
	}

	
	public ArrayList<Recurso> listadeRecursosInvolucrados(){
			return new ArrayList<Recurso>(recursos);
	}
	
	
	public boolean SepuedeasignarRecurso(Recurso r) {
		return r.estoydisponibleparaTarea(this);	
		}
	
	
	
	public boolean equals(Object o1) {
		try {
		Tareaterminal t= (Tareaterminal)o1;
		return (this.getNombre().equals(t.getNombre()));
		}
		catch(Exception exc) {
			return false;
		}
	}

	public boolean compararFecha(Tareaterminal t) {
		if ((t.fechaInicio.isAfter(this.fechaInicio))&&(t.fechaFin.isBefore(this.fechaFin))) {
			return true;
		}
		else if((fechaFin.isAfter(this.fechaInicio))&&(t.fechaFin.isBefore(this.fechaFin))) {
			return true;
		}
		else if((t.fechaInicio.isBefore(this.fechaInicio))&&(t.fechaFin.isAfter(this.fechaFin))) {
			return true;
		}
		else if((t.fechaInicio.isAfter(this.fechaInicio))&&(t.fechaInicio.isBefore(this.fechaFin))) {
			return true;
		}
		else return false;
		
	}
	

	@Override
	public int duracionTarea() {
			LocalDate fechainicioTodas= this.getFechaInicio();
			LocalDate fechafinTodas= this.getFechaFin();
			return (int)(fechafinTodas.getDayOfYear()-fechainicioTodas.getDayOfYear());
		
		}

	@Override
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}

	@Override
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	@Override
	public void setFechaInicio(LocalDate fechaini) {
		this.fechaInicio=fechaini;
		
	}

	@Override
	public void setFechafin(LocalDate fechafin) {
		this.fechaFin=fechafin;
		
	}
	}
