package fileSystem;

import java.util.ArrayList;

import fileSystem.criterios.Criterio;

public class Archivo extends ElementFileSystem{
	private double tamanio;
	private String extension;
	
	
	
	public String getExtension() {
		return extension;
	}



	public Archivo(String nombre, double tamanio,String extension ) {
		super(nombre);
		this.tamanio=tamanio;
		this.extension=extension;
		this.padre=super.padre;
	}



	@Override
	public double getTamanio() {
		return this.tamanio;
	}



	@Override
	public boolean contieneElemento(ElementFileSystem e) {
		return this.equals(e);
	}



	@Override
	public String toString() {
		return "/"+this.getNombre()+"."+ this.getExtension();
	}
	
	
	public int contarArchivo() {
		return 1;
	}



	@Override
	public int contarElementos() {
		// TODO Auto-generated method stub
		return 1;
	}



	@Override
	public int contarCarpetas() {
		return 0;
	}



	@Override
	public ArrayList<ElementFileSystem> listaelementosxCriterio(Criterio c) {
		ArrayList<ElementFileSystem> listaElementos= new ArrayList<>();
		if (c.cumple(this)) {
			listaElementos.add(this);
		}
		return listaElementos;
	}
	
	
	
}
