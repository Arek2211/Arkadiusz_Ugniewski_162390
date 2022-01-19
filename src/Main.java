import Kandydet.Kandydet;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Kandydet k1 = new Kandydet("Jan Kowalski", 35, "Wyższe", 9);
        Kandydet k2 = new Kandydet("Jan Inny", 35, "Średnie", 11);
        Kandydet k3 = new Kandydet("Jan Trzeci", 40, "Wyższe", 12);
        Kandydet k4 = new Kandydet("Jan Czwarty", 50, "Wyższe", 13);
        Kandydet k5 = new Kandydet("Jan Piąty", 50, "Wyższe", 15);
        ArrayList<Kandydet> lista = new ArrayList<Kandydet>();
        lista.add(k5);
        lista.add(k4);
        lista.add(k3);
        lista.add(k2);
        lista.add(k1);
        System.out.print(lista + "\n");
        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);
        if (k2.Qualified()) {
            System.out.println("Tak");
        }
    }
}