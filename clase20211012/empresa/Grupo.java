package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends ElementoEmpresa{
    private String nombre;

    private ArrayList<ElementoEmpresa> elementos;

    public Grupo(String nombre){
        this.nombre = nombre;
        elementos = new ArrayList<>();
    }

    public void add(ElementoEmpresa e){
        if (!elementos.contains(e))
            elementos.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public int cantEmpleados(){
        int cantTotal = 0;
        for (ElementoEmpresa e:elementos) {
            int cantParcial = e.cantEmpleados();
            cantTotal = cantTotal + cantParcial;
        }
        return cantTotal;
    }

    public double gastoSueldos(){
        double total = 0.0;
        for (ElementoEmpresa e:elementos)
            total += e.gastoSueldos();
        return total;
    }

    public ArrayList<Empleado> empleadosCon(String especialidad, Comparator<Empleado> orden) {
        ArrayList<Empleado> empleadosConEspecialidad = this.empleadosCon(especialidad);
        Collections.sort(empleadosConEspecialidad, orden);
        return empleadosConEspecialidad;
    }
    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> empleadosConEspecialidad = new ArrayList<>();

        //Solución "descomprimida"
        /*for (ElementoEmpresa e: elementos) {
            ArrayList<Empleado> resParcial = e.empleadosCon(especialidad);
            for (Empleado emp:resParcial)
                empleadosConEspecialidad.add(emp);
        }*/

        //Solución compacta (EQUIVALENTE a la anterior)
        for (ElementoEmpresa e: elementos) {
            empleadosConEspecialidad.addAll(e.empleadosCon(especialidad));
        }

        return empleadosConEspecialidad;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Grupo grupo = (Grupo) obj;
            return this.getNombre().equals(grupo.getNombre());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
