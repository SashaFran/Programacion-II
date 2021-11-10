package fileSystem.comparador;

import java.util.Comparator;

import fileSystem.ElementFileSystem;

public class ComparatorNot implements Comparator<ElementFileSystem> {

	Comparator<ElementFileSystem> c1;
	
	public ComparatorNot(Comparator<ElementFileSystem> c) {
		this.c1=c;
	}
	
	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
		return - (c1.compare(o1, o2));
	}

}
