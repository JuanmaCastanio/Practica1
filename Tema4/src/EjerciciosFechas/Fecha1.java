package EjerciciosFechas;

import java.time.LocalDate;
import java.time.Month;

public class Fecha1 {
    public static void main(String[] args) {
        LocalDate fechaDeCumpleanos = LocalDate.of(1990, Month.JANUARY, 15);

        System.out.println("Fecha de cumpleaños en modo corto: " + fechaDeCumpleanos);
    }
}
