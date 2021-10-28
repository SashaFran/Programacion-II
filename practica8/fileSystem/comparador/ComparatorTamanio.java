package fileSystem.comparador;

import java.util.Comparator;

import fileSystem.ElementFileSystem;

public class ComparatorTamanio implements Comparator<ElementFileSystem> {

	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
		return (int)(o1.getTamanio()-o2.getTamanio());
	}

}
