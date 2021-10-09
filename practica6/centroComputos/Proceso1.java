package centroComputos;

public class Proceso1 implements ElementoCola{
    private String nombre;
    private double memRequerida;

    public Proceso1(String nombre, double memRequerida) {
        this.nombre = nombre;
        this.memRequerida = memRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMemRequerida() {
        return memRequerida;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", memRequerida=" + memRequerida +
                '}';
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return this.getMemRequerida() > ((Proceso) otro).getMemRequerida();
    }

    @Override
    public boolean equals(Object otro){
        try {
            Proceso otroProceso = (Proceso) otro;
            return this.getNombre().equals(otroProceso.getNombre()) &&
                    this.getMemRequerida() == otroProceso.getMemRequerida();
        } catch (Exception e){
            return false;
        }

    }
}
