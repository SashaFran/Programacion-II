package zoologico;

public class Jaula extends ObjetoDinamico{

    public Jaula(){
        super();
    }

    public boolean apto(Animal a){
        return a.apta(this);
        //¿Que hubiera estado mal aca?
        //Criterio c = a.getRequisitos();
        //return c.cumple(this);
    }
}
