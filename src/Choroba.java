import java.util.Objects;

public class Choroba {
    private String Nazwa_choroby;

    private int Stopien_smiertelnosci;

    public Choroba(String nazwa_choroby) {
        Nazwa_choroby = nazwa_choroby;
    }

    public Choroba() {
    }

    public String getNazwa_choroby() {
        return Nazwa_choroby;
    }

    public void setNazwa_choroby(String nazwa_choroby) {
        Nazwa_choroby = nazwa_choroby;
    }

    public int getStopien_smiertelnosci() {
        return Stopien_smiertelnosci;
    }

    public void setStopien_smiertelnosci(int stopien_smiertelnosci) {
        Stopien_smiertelnosci = stopien_smiertelnosci;
    }

    @Override
    public String toString() {
        return String.format("Choroba: %s, Stopień śmiertelności: %d (w punktach od 1 do 10) ", Nazwa_choroby, Stopien_smiertelnosci);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choroba choroba = (Choroba) o;
        return Stopien_smiertelnosci == choroba.Stopien_smiertelnosci && Objects.equals(Nazwa_choroby, choroba.Nazwa_choroby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nazwa_choroby, Stopien_smiertelnosci);
    }
}
