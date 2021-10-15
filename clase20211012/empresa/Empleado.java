package empresa;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{
    private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String apellido, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public double gastoSueldos() {
        return sueldo;
    }

    @Override
    public ArrayList<Empleado> empleadosCon(String especialidad) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        if (this.getEspecialidad().equals(especialidad))
            empleados.add(this);
        return empleados;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Empleado emp = (Empleado) obj;
            return this.getNombre().equals(emp.getNombre()) &&
                    this.getApellido().equals(emp.getApellido());
        } catch(Exception e) {
            return false;
        }
    }

    @Override
    public int cantEmpleados() {
        return 1;
    }



    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", sueldo=" + sueldo +
                '}'+"\n";
    }
}
