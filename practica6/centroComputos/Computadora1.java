package centroComputos;

public class Computadora1 implements ElementoCola{
    private double velocidadCPU;
    private String nombre;
    private Proceso proc;

    public Computadora1(String nombre, double velocidadCPU) {
        this.velocidadCPU = velocidadCPU;
        this.nombre = nombre;
        proc = null;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public String getNombre() {
        return nombre;
    }

    public void ejecutarProceso(Proceso p){
        this.proc = p;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "velocidadCPU=" + velocidadCPU +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean esMayor(ElementoCola otro) {
        return false;
    }

	public Proceso getProc() {
		return proc;
	}
    
    
}
