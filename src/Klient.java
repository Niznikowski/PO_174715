import java.util.ArrayList;

public class Klient extends Osoba {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;
    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(Zamowienie i: listaZamowien){
            i.wyswietlZamowienie();
        }
    }
    public int obliczLacznyKosztZamowien(){
        int suma = 0;
        for(Zamowienie i: listaZamowien){
            suma += i.getkoszyk().obliczCalkowitaWartosc();
        }
        return suma;
    }



}
