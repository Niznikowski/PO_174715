import java.util.HashMap;

public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;
    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia, Platnosc platnosc){
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }
    public KoszykZakupowy getkoszyk(){
        return koszykZakupowy;
    }
    public void ustawStatusZamowienia(String status){
        statusZamowienia = status;
    }
    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println(statusZamowienia);
    }
    public void finzalizujZamowienie(){
        if(platnosc.getsp() == "Opłacone"){
            statusZamowienia = "Gotowe do wysyłki";
        }
    }
    public void zwrocProdukt(zestaw_6.Produkt produkt, int ilosc, KoszykZakupowy koszykZakupowy, Magazyn magazyn){
        magazyn.dodajDoMagazynu(ilosc);

        //do zrobienia aktulizacja stanu koszyka oraz kwoty zamówienia

    }
}
