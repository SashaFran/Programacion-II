package documentador;

import java.util.List;

import documentador.criterios.*;
public class Historiador {

	private String nombre;
	private PilaDocumento documentos;
	
	public Historiador(String nombre){
		this.nombre = nombre;
		this.documentos = new PilaDocumento();
	}
	
	public List<Documento> getDocumentosPorTitulo(String titulo){
		System.out.println("\nTitulo: "+titulo+"\n");
		return documentos.buscar(new CriterioPorTitulo(titulo.toUpperCase()));
	}
	
	public List<Documento> getDocumentosPorTituloContiene(String contenido){
		System.out.println("\n Titulo contenido: " + contenido + "\n");
		return documentos.buscar(new CriterioPorTituloContiene(contenido.toUpperCase()));
	}

	public List<Documento> getDocumentosPorPalabraClave(String palabraClave) {
		System.out.println("\n Palabra clave = " + palabraClave + "\n");
		return documentos.buscar(new CriterioPorPalabraClave(palabraClave.toUpperCase()));
	}	
	
	public List<Documento> getDocumentosSinPalabraClave() {
		System.out.println("\n Sin Palabra clave \n");
		return documentos.buscar(new CriterioSinPalabraClave());
	}
	
	public List<Documento> getDocumentosPorAutor(String autor) {
		System.out.println("\n Autor = " + autor + "\n");
		return documentos.buscar(new CriterioAutor(autor.toUpperCase()));
	}
	
	public List<Documento> getDocumentosPorContenido(String contenido) {
		System.out.println("\n Palabra dentro del contenido = " + contenido + "\n");
		return documentos.buscar(new CriterioPorContenido(contenido.toUpperCase()));
	}	
	
	public List<Documento> getDocumentosPorContenidoCantPalabras(int cantPalabras) {
		System.out.println("\n Cantidad de Palabra del contenido = " + cantPalabras + "\n");
		return documentos.buscar(new CriterioCantPalabras(cantPalabras));
	}
	
	public List<Documento> getDocumentosPorAutorPorContenidoCantPalabras(String autor, int cantPalabras) {
		System.out.println("\n Compuesto autor = " + autor + " cantidad palabras = " + cantPalabras + "n");
		Criterio pa = new CriterioAutor(autor.toUpperCase());
		Criterio pccp = new CriterioCantPalabras(cantPalabras);
		
		return documentos.buscar(new CriterioCompuestoAND(pa , new CriterioCompuestoAND(pccp, null) ) );
	}
	
	public void addDocumento (Documento d){
		this.documentos.addDocumento(d);
	}

	public String getNombre() {
		return nombre;
	}

	public List<Documento> getDocumentos(){
		return documentos.getDocumentos();
	}

	@Override
	public String toString() {
		return "Historiador [nombre=" + nombre + ", documentos=" + documentos
				+ "]";
	}
	
	
}
