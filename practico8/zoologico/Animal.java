package zoologico;


public class Animal extends ObjetoDinamico{

    //Las condiciones que tiene que
    // tener la jaula para que el animal pueda habitarla
    // Si es más de 1, puedo usar CriterioAnd y CriterioOr
    private Criterio requisitos;

    public Animal(Criterio requisitos){
        super();
        this.requisitos = requisitos;
    }

    public boolean apta(Jaula j){
        return requisitos.cumple(j);
    }
}
