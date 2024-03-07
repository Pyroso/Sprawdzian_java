import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Choroba choroba1 = new Choroba("Tyfus");
        choroba1.setStopien_smiertelnosci(5);

        Choroba choroba2 = new Choroba("Wścieklizna");
        choroba2.setStopien_smiertelnosci(10);

        Choroba choroba3= new Choroba("Przeziębienie");
        choroba3.setStopien_smiertelnosci(1);

        Pacjent pacjent1 = new Pacjent("Jan", "Kowalski", LocalDate.now(), choroba1);
        Pacjent pacjent2 = new Pacjent("Fryta", "Frytkowski", LocalDate.now(), choroba2);
        Pacjent pacjent3 = new Pacjent("Lala", "Alaal", LocalDate.now(), choroba3);

        System.out.println(pacjent1);

        System.out.println(pacjent2);

        System.out.println(pacjent3);

        Lekarz lekarz1 = new Lekarz("Władysław", "Piłka");
        lekarz1.Dodaj_pacjenta(pacjent1);

        Lekarz lekarz2 = new Lekarz("Stanisław", "Kokos");
        lekarz2.Dodaj_pacjenta(pacjent2);

        Lekarz lekarz3 = new Lekarz("Maciej", "Czekolada");
        lekarz3.Dodaj_pacjenta(pacjent3);
    }
}