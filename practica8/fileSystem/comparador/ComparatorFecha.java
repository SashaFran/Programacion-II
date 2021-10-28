package fileSystem.comparador;

import java.util.Comparator;

import fileSystem.ElementFileSystem;

public class ComparatorFecha implements Comparator<ElementFileSystem>{

	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
		
		return (o1.getFechaCreacion().getDayOfYear()-o2.getFechaCreacion().getDayOfYear());
	}

}
