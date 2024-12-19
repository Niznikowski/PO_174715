import java.util.ArrayList;

public class KlientIdywidualny extends Klient{
    private final String PESEL;

    public KlientIdywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, String pesel) {
        super(imie, nazwisko, listaZamowien, adres);
        PESEL = pesel;
    }
}
