import java.time.LocalDate;
import java.util.Objects;

public class Pacjent {
    private String Imie;

    private String Nazwisko;

    private LocalDate Data_przyjecia;

    private Choroba choroba;

    public Pacjent(String imie, String nazwisko, LocalDate data_przyjecia, Choroba choroba) {
        Imie = imie;
        Nazwisko = nazwisko;
        Data_przyjecia = data_przyjecia;
        this.choroba = choroba;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public LocalDate getData_przyjecia() {
        return Data_przyjecia;
    }



    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s, Data przyjęcia: %s, %s ", Imie, Nazwisko, Data_przyjecia, choroba);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacjent pacjent = (Pacjent) o;
        return Objects.equals(Imie, pacjent.Imie) && Objects.equals(Nazwisko, pacjent.Nazwisko) && Objects.equals(Data_przyjecia, pacjent.Data_przyjecia) && Objects.equals(choroba, pacjent.choroba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Imie, Nazwisko, Data_przyjecia, choroba);
    }
}
