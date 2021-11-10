package turismo;
import turismo.Criterios.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;



public class Contingente extends ElementoContingente {

	protected ArrayList<ElementoContingente> elementos;
	protected Criterio criterioAdmision;

	public Contingente(String nombre, String destino, LocalDate fechaDePartida, LocalDate fechaDeRegreso,
			Criterio criterioAdmision) {
		super(nombre, destino, fechaDePartida, fechaDeRegreso);
		this.elementos = new ArrayList<>();
		this.criterioAdmision = criterioAdmision;
	}

	public void agregarElemento(ElementoContingente e) {
		if (criterioAdmision.cumple(e)) {
			elementos.add(e);
		}
	}

	public ArrayList<ElementoContingente> getElementos() {
		ArrayList<ElementoContingente> elementosC = new ArrayList<>(elementos);
		return elementosC;
	}

	public Criterio getCriterioAdmision() {
		return criterioAdmision;
	}

	public void setCriterioAdmision(Criterio criterioAdmision) {
		this.criterioAdmision = criterioAdmision;
	}

	@Override
	public double getPrecio() {
		int total = 0;
		for (ElementoContingente e : elementos) {
			double totalParcial = e.getPrecio();
			total += totalParcial;
		}
		return total;
	}

	@Override
	public double getDeuda() {
		int total = 0;
		for (ElementoContingente e : elementos) {
			double totalParcial = e.getDeuda();
			total += totalParcial;
		}
		return total;
	}

	@Override
	public int totalAlumnos() {
		int total = 0;
		for (ElementoContingente e : elementos) {
			int totalParcial = e.totalAlumnos();
			total += totalParcial;
		}
		return total;
	}

	public boolean contieneElementos() {
		return !elementos.isEmpty();
	}

	@Override
	public ElementoContingente copia() {
		Contingente copia = new Contingente(this.getNombre(), this.getDestino(), this.getFechaDePartida(), this.getFechaDeRegreso(), this.getCriterioAdmision());
		for (ElementoContingente e : elementos) {
			ElementoContingente copiaHija = e.copia();
			if (copiaHija != null) {
				copia.agregarElemento(copiaHija);
			}
		}
		if (copia.contieneElementos()) {
			return copia;
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<ElementoContingente> busquedaFiltro(Criterio c) {
		ArrayList<ElementoContingente> elementosSeleccion = new ArrayList<>();
		if (c.cumple(this)) {
			elementosSeleccion.add(this);
		}
		for (ElementoContingente e : elementos) {
			elementosSeleccion.addAll(e.busquedaFiltro(c));
		}

		return elementosSeleccion;
	}

	public Alumno busquedaAlumnoDeudor() {
		double deudaMayor = 0;
		Alumno AlumnoDeudor = null;
		for (ElementoContingente e : elementos) {
			Alumno AdeudorParcial = e.busquedaAlumnoDeudor();
			if (AdeudorParcial != null) {
				double deudaParcial = AdeudorParcial.getDeuda();
				if (deudaParcial > deudaMayor) {
					deudaMayor = deudaParcial;
					AlumnoDeudor = AdeudorParcial;
				}
			}
		}
		return AlumnoDeudor;
	}

}
