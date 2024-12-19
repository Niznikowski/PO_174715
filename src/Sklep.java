import java.util.ArrayList;

public class Sklep {
    private ArrayList<zestaw_6.Produkt> produkty;
    private String nazwaSklepu;
    private String dataPowstania;
    private Magazyn magazynSklepu;
    public Sklep(ArrayList<zestaw_6.Produkt> produkty, String nazwaSklepu, String dataPowstania, Magazyn magazynSklepu){
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }
    public void dodajProdukt(zestaw_6.Produkt produkt){
        produkty.add(produkt);
    }
    public void wyswietlOferty(){
        for(zestaw_6.Produkt i: produkty){
            i.wyswietlInformacje();
        }
    }
    public void wyszukajProduktu(String nazwa){
        for(zestaw_6.Produkt i: produkty){
            if(i.nazwa == nazwa){
                System.out.print("Twój produkt: ");
                i.wyswietlInformacje();
            }
        }
    }
    public void zakupy(zestaw_6.Produkt produkt, int ilosc, KoszykZakupowy koszyk, Magazyn magazyn){
        koszyk.dodajProdukt(produkt, ilosc, magazyn);
        magazyn.usunZMagazynu(ilosc);
    }




}
