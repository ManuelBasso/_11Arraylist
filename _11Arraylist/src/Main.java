import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creare un ArrayList con 12 elementi e stamparlo in console.

        Student st1 = new Student("Manu", 33);
        Student st2 = new Student("Luca", 31);
        Student st3 = new Student("Manu", 32);
        Student st4 = new Student("Gigi", 22);
        Student st5 = new Student("Paolo", 24);
        Student st6 = new Student("Maria", 21);
        Student st7 = new Student("Manu", 22);
        Student st8 = new Student("Lisa", 44);
        Student st9 = new Student("Anna", 43);
        Student st10 = new Student("Laura", 22);
        Student st11 = new Student("Giacomo", 11);
        Student st12 = new Student("Gino", 14);

        List<Student> classeStudenti = new ArrayList<>(Arrays.asList(st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12));
        System.out.println("Classe: " + classeStudenti);

        //mettere in ordine la collezione e stampare il risultato
        //decido di ordinarla per nome
        classeStudenti.sort(Comparator.comparing(Student::getName));
        System.out.println("Classe sort name: " + classeStudenti);

    }
}