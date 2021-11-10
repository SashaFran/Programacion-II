package fileSystem.comparador;

import java.util.Comparator;

import fileSystem.ElementFileSystem;

public class ComparatorAnd implements Comparator<ElementFileSystem> {

	private Comparator<ElementFileSystem> com1;
	private Comparator<ElementFileSystem> com2;
	
	public ComparatorAnd(Comparator<ElementFileSystem> com1, Comparator<ElementFileSystem> com2) {
		this.com1=com1;
		this.com2=com2;
	}
	
	@Override
	public int compare(ElementFileSystem o1, ElementFileSystem o2) {
			int comparador1= com1.compare(o1, o2);
			if (comparador1==0) {
				return com2.compare(o1, o2);
			}
			return comparador1;
	}

}
