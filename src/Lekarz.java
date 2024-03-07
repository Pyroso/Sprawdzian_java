import java.util.ArrayList;

public class Lekarz {
    private String Imie;

    private String Nazwisko;

    private ArrayList <Pacjent> ListaPacjentow = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        Imie = imie;
        Nazwisko = nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public ArrayList<Pacjent> getListaPacjentow() {
        return ListaPacjentow;
    }

    public void Dodaj_pacjenta(Pacjent pacjent){
        ListaPacjentow.add(pacjent);
        System.out.println("Dodano pacjenta: " + pacjent);
    }
}
