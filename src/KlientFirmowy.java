import java.util.ArrayList;

public class KlientFirmowy extends Klient {
    private final String NIP;
    private final String REGION;

    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, String nip, String region) {
        super(imie, nazwisko, listaZamowien, adres);
        NIP = nip;
        REGION = region;
    }
}
