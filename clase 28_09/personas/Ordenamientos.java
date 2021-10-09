package personas;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Ordenamientos {
    public static void main(String[] args) {
        List<String> nombres = new Vector<>();
        nombres.add("Luis");
        nombres.add("Marcelo");
        nombres.add("Ariel");
        nombres.add("Soledad");
        nombres.add("Franco");
        nombres.add("Sebastian");
        nombres.add("Yago");
        nombres.add("Andres");
        System.out.println(Collections.min(nombres));
        System.out.println(Collections.max(nombres));

        Collections.sort(nombres);
        System.out.println(nombres);

        int res = "Andres".compareTo("Yago");
        System.out.println("Andres es menor que Ariel en "+res);

        Persona ariel = new Persona("Ariel", LocalDate.now(), 2);
        Persona yago = new Persona("Yago", LocalDate.now(), 0);
        Persona seba = new Persona("Sebastian", LocalDate.now(), 0);
        Persona sole = new Persona("Soledad", LocalDate.now(), 1);
        Persona franco = new Persona("Franco", LocalDate.now(), 7);


        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(ariel);
        personas.add(yago);
        personas.add(seba);
        personas.add(sole);
        personas.add(franco);

        System.out.println("Ordenados por cant de hijos");
        Collections.sort(personas);
        System.out.println(personas);
    }
}
